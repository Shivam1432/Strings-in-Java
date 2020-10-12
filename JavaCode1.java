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
public class JavaCode1 {
	// least code regex method, replaces tags with empty str
	public static String removeWithRegex(String input) {
		return input.replaceAll("<.+?>", "");
	}

	// more code, easier to understand and maintains original newline formatting
	public static String removeWithRegexLoop(String input) {
		// set-up simple regex for matching html tags
		String patternStr = "<.+?>";
		Pattern pattern = Pattern.compile(patternStr);
		Matcher pMatcher = pattern.matcher(input);
		// set up string builder for efficiently creating result
		StringBuilder result = new StringBuilder();
		// use int to track end of last tag
		int last_pos = 0;

		// iterate through matches and skipping their portion of the string
		while (pMatcher.find()) {
			// append text prior to match
			result.append(input.substring(last_pos, pMatcher.start()));
			// record end of match
			last_pos = pMatcher.end();
			// add a new line if needed
			if (result.length() > 0 && last_pos != input.length() && result.charAt(result.length() - 1) != '\n') {
				result.append("\n");
			}
		}

		// return result
		return result.toString();
	}

    public static void main(String[] args) 
	{
		// default input
		String str = "<h1>My Website</h1><h1>My Page</h1><h1><h1></h1>My Print</h1>";
		
		// demonstrate regex methods
		System.out.println("~~ Straight empty str regex replacement... ~~");
		System.out.println(removeWithRegex(str));
		System.out.println("~~ Regex loop method... (adds new line after any content) ~~");
		System.out.println(removeWithRegexLoop(str));
		
		// maintain original substr iteration method
		System.out.println("~~ Substr iteration method... ~~");
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
