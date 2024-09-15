/*
 * Q7. Print first letter of every word in the string (Zoho)
Input:
S = "geeks for geeks"
Output: gfg

 */
package string.practice;

import java.util.Scanner;

public class PrintFirstChar {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s = sc.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) 
		{
			System.out.print(str[i].charAt(0));
		}
	}

}
