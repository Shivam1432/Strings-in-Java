/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.regex.*;

/**
 *
 * @author Shivam Rana
 */
public class JavaCode4 {
    public static boolean matchPassword(String input) {
        String pStr = "(?=.*@)(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).*";
        Pattern p = Pattern.compile(pStr);
        Matcher m = p.matcher(input);
        return input.length() >= 5 && m.find();
    }
    public static void main(String[] args) {        
        String str="Dapinder@34";

        // demonstrate regex alternative
        System.out.println("Is valid: " + matchPassword(str));

        char[] arr=str.toCharArray();
        int len=str.length();
        int uc=0,lc=0,n=0,a=0;
        if(len<4)
        {
            System.out.println("password is weak");
        }
        else
        {
            for(int i=0;i<len;i++)
        {
            if(arr[i]>=97 && arr[i]<=122)
                {
                    lc++;
                }
        } 
        for(int i=0;i<len;i++)
        {
            if(arr[i]>=65 && arr[i]<=90)
            {
                uc++;
            }
        }
        for(int i=0;i<len;i++)
        {
            if(arr[i]>=48 && arr[i]<=57)
            {
                n++;
            }
        }
       for(int i=0;i<len;i++)
       {
           if(arr[i]==64)
           {
               a++;
           }
       }
        if(a<0)
        {
            System.out.println("Password must contain @");
        }
        else
        {
            if(uc>0 && lc>0 && n>0)
            {
               System.out.println("Password is valid");
               for(int i=0;i<len;i++)
               {
                   System.out.print(arr[i]);
               }
            }
            else
            {
                System.out.println("Password must contain a lower case aplhabet, an upper case alphabet and a number");
            }
        }
        }
    }
}
