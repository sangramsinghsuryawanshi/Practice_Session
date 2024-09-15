/*
 * Q1. Reverse the vowels only (Flipkart)
S = "practice"
Output: prectica
Explanation: The vowels are a, i, e
Reverse of these is e, i, a.

 */
package string.practice;

import java.util.Scanner;

public class ReverseVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str= sc.nextLine();
		char ch[]=str.toCharArray();
		char ch1[]=new char[str.length()];
		int x=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u') 
			{
				ch1[x++]=ch[i];
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
			{
				x--;
				ch[i]=ch1[x];
			}
		}
		String s = new String(ch);
		System.out.println("Given string is: "+s);
	}
}
