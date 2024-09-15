package string.practice;

import java.util.Scanner;

public class PrintThoseFirstCharIsVowel 
{

	public String[] isVowel(String s[])
	{
		int x=0;
		String temp[]= new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].charAt(0)=='a' || s[i].charAt(0)=='e' || s[i].charAt(0)=='i' || s[i].charAt(0)=='o' || s[i].charAt(0)=='u')
			{
				temp[x++]=s[i];
			}
		}
		return temp;
	}	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		String s []= givenString.split(" ");
		PrintThoseFirstCharIsVowel p = new PrintThoseFirstCharIsVowel();
		String str[]=p.isVowel(s);
		System.out.print("\nReverse word is: ");
		for(int i=0;i<str.length-3;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
}
