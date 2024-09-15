package string.practice;

import java.util.Scanner;

public class SortStringLengthWise 
{
	public String[] isSort(String s[])
	{
		int x=0;
		String temp[]= new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()>s[j].length())
				{
					String s1=s[i];
					s[i]=s[j];
					s[j]=s1;
				}
			}
			temp[x++]=s[i];
		}
		return temp;
	}	
	public String[] isSortDE(String s[])
	{
		int y=0;
		String temp1[]= new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()<s[j].length())
				{
					String s1=s[i];
					s[i]=s[j];
					s[j]=s1;
				}
			}
			temp1[y++]=s[i];
		}
		return temp1;
	}	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		String s []= givenString.split(" ");
		SortStringLengthWise p = new SortStringLengthWise();
		String str[]=p.isSort(s);
		System.out.print("\nAscending order is: ");
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		
		String str1[]=p.isSortDE(s);
		System.out.print("\nDescending order is: ");
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]+" ");
		}
	}
}
