/*
 * Wap enter a string and remove all duplicate 
 * character using class and object.
 */
package string.practice;

import java.util.Scanner;

public class RemoveDuplicateQ11 
{
	public char[] isRemoved(char [] ch)
	{
		System.out.print("Given character is: ");
		int c=ch.length,x=0;
		char s[]=new char[c];
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0')
			{
				s[x++] =ch[i];
			}
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
		RemoveDuplicateQ11 r = new RemoveDuplicateQ11();
		char c[]=r.isRemoved(charaterArray);
		for(int j=0;j<c.length;j++)
		{
			if(c[j]!=' ' && c[j]!='\0')
			System.out.print(c[j]+" ");
		}
	}

}
