/*
 * Q1. Reverse the vowels only (Flipkart)
 S ="practice"
 Output: prectica
 Explanation: The vowels are a, i, e
 Reverse of these is e, i, a.
 */
package string.practice;

import java.util.Scanner;

public class ReverseVowel1 
{
	public static void isReverse(String str)
	{
		char ch[]=str.toCharArray();
		int x=0;
		char s[]= new char[3];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				s[x++]=ch[i];
			}
		}
		x--;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				ch[i]=s[x--];
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+"");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		isReverse(str);
	}

}
