
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivam Rana
 */
public class JavaCode5 {
    public static void main(String[] args) {
        String str="John and Harry are my friends. Out of the both, my best buddy is John. John, which is my best buddy, belongs to USA, where USA is most powerful nation.";
        String[] temp=str.split(" ");
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int l=s.length();
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            int len1=temp[i].length();
            String new1=temp[i];
            if(l==len1)
            {
                if(s.equalsIgnoreCase(temp[i]))
                {
                    count++;
                    System.out.println(s+" found at word number "+i);
                }
                
            }
            else if(l+1==len1)
            {
                if(s.equalsIgnoreCase(temp[i].substring(0,len1-1)))
                {
                    count++;
                    System.out.println(s+" found at word number "+i);
                }
            }
        }
        System.out.println(s+" found "+count+" times");
    }
}
