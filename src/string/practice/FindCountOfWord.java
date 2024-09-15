package string.practice;

import java.util.Scanner;

public class FindCountOfWord 
{
	public int isCount(String s[])
	{
		int x=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]!=" ")
			{
				x++;
			}
		}
		return x;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		String s []= givenString.split(" ");
		FindCountOfWord p = new FindCountOfWord();
		int cnt=p.isCount(s);
		System.out.print("\nCount of word is: "+cnt);
	}
}
