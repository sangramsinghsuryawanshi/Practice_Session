/*
 * Q1.Wap enter a string and print it in a reverse order word by word.
 */
package string.practice;

import java.util.Scanner;

public class PrintReverseWord 
{
	public String[] isReverse(String s[])
	{
		String temp[]= new String[s.length];
		int x=0;
		for(int i=s.length-1;i>=0;i--)
		{
			temp[x++]=s[i];
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		String s []= givenString.split(" ");
		PrintReverseWord p = new PrintReverseWord();
		String str[]=p.isReverse(s);
		System.out.print("\nReverse word is: ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
}
