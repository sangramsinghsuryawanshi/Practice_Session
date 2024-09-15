package string.practice;

import java.util.Scanner;

public class FirstOccurenceOfWord 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		int len=givenString.length();
		String[] splitString=givenString.split(" ");
		int c=0;
		String[] ch=new String[len];
		for(int i=0;i<splitString.length;i++)
		{
			for(int j=i+1;j<splitString.length;j++)
			{
				if(splitString[i].equals(splitString[j]))
				{
					if(c==0)
					{
						ch[c++]=splitString[i];
					}
				}
			}
		}
		System.out.print("First occurence word is: ");
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
			break;
		}
	}
}
