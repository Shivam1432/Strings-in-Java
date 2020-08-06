/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivam Rana
 */
public class JavaCode2 {
    public static void main(String[] args) {
        String str="United States has attacked Iran";
        countEachChar(str);
    }
    static void countEachChar(String str)
    {
        int counter[]=new int[256];
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            counter[str.charAt(i)]++; 
        }
        System.out.println(str);
        char array[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) 
        { 
	   array[i] = str.charAt(i); 
	   int flag = 0; 
	   for (int j = 0; j <= i; j++) 
           { 
               if (str.charAt(i) == array[j])  
			flag++;                 
           }
           if(flag==1)
           {
               if(counter[str.charAt(i)]>=1)
               {
                  System.out.print(str.charAt(i));  
               }
           }
           if(counter[str.charAt(i)]>=1)
           {
               if(flag!=1)
               {
                   System.out.print(" ");
               }
           }
        }
    }
}
