/*
 * Q20.Wap enter a string and find the count of white space.
 */
package string.practice;

import java.util.Scanner;

public class CountWhiteSpaces {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		char ch[]=givenString.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				cnt++;
			}
		}
		System.out.println("Count of whitespace is: "+cnt);
	}

}
