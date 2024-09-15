/*
 * Q10. Write a Java program to read a given string and if the first 
 * or last characters are same return the string without those characters 
 * otherwise return the string unchanged

 */
package string.practice;

import java.util.Scanner;

public class UnchangedString 
{
	int o;
	public char[] isUnchanged(char [] ch)
	{
		int x=0,y=0,z=0;
		char s[]= new char[ch.length];
		char s1[]= new char[ch.length];
		int cnt=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(i==0 && j==ch.length-1)
				{
					if(ch[i]==ch[j])
					{
						cnt=1;
						ch[i]='0';
						ch[j]='0';
					}
				}
			}
			if(ch[i]!='0')
			{
				z++;
				s[x++]=ch[i];
			}
			if(cnt==1)
			{
				s1[o++]=ch[i];
			}
		}
		if(z>0)
		{
			return s;
		}
		else
		{
			return s1;
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		char charaterArray[]=givenString.toCharArray();
		UnchangedString r = new UnchangedString();
		char c[]=r.isUnchanged(charaterArray);
		System.out.print("\nGiven string is: ");
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='\0')
			System.out.print(c[i]+"");
		}
	}

}
