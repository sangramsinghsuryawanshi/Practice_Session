package string.practice;

import java.util.Scanner;

public class MostRepeatedChar 
{

	public char isMostRepeated(char [] ch)
	{
		int max=0;
		char s='\0';
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
			if(ch[i]!='\0' && cnt>max)
			{
				max=cnt;
				s=ch[i];
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
		MostRepeatedChar r = new MostRepeatedChar();
		char c=r.isMostRepeated(charaterArray);
		System.out.print("\nGiven Most repeating character is: "+c);
	}

}
