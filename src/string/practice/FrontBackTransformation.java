/*
 * Q4. Front-Back Transformation - copy (Microsoft)
Input: S = "Hello"
Output: Svool
Explanation: 'H' is the 8th letter from the
beginning of alphabets, which is replaced by
'S' which comes at 8th position in reverse order
of alphabets. Similarly, all other letters are
replaced by their respective upper or lower case
letters accordingly.

 */
package string.practice;

import java.util.Scanner;

public class FrontBackTransformation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str= sc.nextLine();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.print(Character.toUpperCase((char)
					(((int)'z')-((int)(Character.toLowerCase(ch[i])-65)))));
		}
	}
}
