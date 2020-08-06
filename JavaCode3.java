/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivam Rana
 */
public class JavaCode3 {
    public static void main(String[] args) {
        String str = "Code Quotient Get Better at Coding";
    String[] tokens = str.split("\\s");  // white space '\s' as delimiter
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < tokens.length; ++i) 
    {
      sb.insert(0, tokens[i]);
      if (i < tokens.length - 1)
        sb.insert(0, " ");
    }
    String strReverse = sb.toString();
    System.out.println(strReverse);
    }
}
