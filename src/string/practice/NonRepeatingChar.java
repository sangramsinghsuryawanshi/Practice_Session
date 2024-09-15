package string.practice;

import java.util.Scanner;

public class NonRepeatingChar 
{
	public char[] isNonRepeated(char [] ch)
	{
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
			if(ch[i]!='\0' && cnt==1)
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
		NonRepeatingChar r = new NonRepeatingChar();
		char c[]=r.isNonRepeated(charaterArray);
		System.out.print("\nGiven non repeating character is: ");
		for(int j=0;j<c.length/2-1;j++)
		{
			if(c[j]!=' ')
			System.out.print(c[j]+" ");
		}
	}

}
