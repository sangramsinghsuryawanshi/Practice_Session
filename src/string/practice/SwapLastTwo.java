/*
 * Q9. Write a Java program to create a new string from a given string swapping the last two 
characters of the given string. The length of the given string must be two or more.
Sample Output:
The given strings is: string 
The string after swap last two characters are: strign

 */
package string.practice;

import java.util.Scanner;

public class SwapLastTwo 
{

	public char[] isSwaped(char [] ch)
	{
		int max=0;
		char[] s= new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(j==ch.length-1 && i==ch.length-2)
				{
					char c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
			s[max++]=ch[i];
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
		SwapLastTwo r = new SwapLastTwo();
		char c[]=r.isSwaped(charaterArray);
		System.out.print("\nGiven character is: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"");
		}
	}

}
