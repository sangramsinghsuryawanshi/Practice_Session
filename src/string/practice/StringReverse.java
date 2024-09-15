/*
 * Q13.Write a Java program to find reverse of a 
 * string using class and object.
 */
package string.practice;

import java.util.Scanner;

public class StringReverse 
{

	public char[] isReverse(char [] ch)
	{
		System.out.print("Given character is: ");
		int c=ch.length,x=0;
		char s[]=new char[c];
		for(int i=ch.length-1;i>=0;i--)
		{
			s[x++]=ch[i];
		}
		return s;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		char charaterArray[]=givenString.toCharArray();
		StringReverse r = new StringReverse();
		char c[]=r.isReverse(charaterArray);
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]+"");
		}
	}

}
