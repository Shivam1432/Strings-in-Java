/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shivam Rana
 */
public class JavaCode1 {
    public static void main(String[] args) 
	{
		String str = "<h1>My Website</h1><h1>My Page</h1><h1><h1></h1>My Print</h1>";
		int j;
		for (int k = 0; k <= str.length() - 1; k++)
			if (str.charAt(k) == '>')
				if (k != str.length() - 1)
				{
					for (j = k + 1; str.charAt(j) != '<'; j++);
						if ((j - k) != 1)
							System.out.println(str.substring(k + 1, j));
				}
	}
}
