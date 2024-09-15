/*
 * Q6. Remove common characters and concatenate (Oracle)
Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.

 */
package string.practice;

import java.util.Scanner;

public class CommonCharacters 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string 1: ");
			String str =sc.nextLine();
			System.out.println("Enter the string 2: ");
			String str1 =sc.nextLine();
			String s =str.concat(str1);
			for(int i=0;i<s.length();i++) 
			{
				int cnt=1;
				for(int j=0;j<s.length();j++) 
				{
					if(s.charAt(i)==s.charAt(j)) 
					{
						cnt++;
					}
				}
				if(cnt==2)
				System.out.print(s.charAt(i));
			}
	}
}