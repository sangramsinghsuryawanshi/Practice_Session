package string.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot 
{
	String p;
	String p1;
	int cnt;
	AnagramOrNot(char [] ch,char ch1[])
	{
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String s = new String(ch);
		String s1 = new String(ch1);
		cnt=0;
		if(s.equals(s1))
		{
			cnt++;
			 p="Given string is anagram";
		}
		else
		{
			 p1="Given string is not anagram";
		}
	}
	public String is()
	{
		if(this.cnt==1)
		{
			return this.p;
		}
		else
		{
			return this.p1;
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String 1: ");
		String givenString1 = sc.nextLine();
		System.out.println("Enter given String 2: ");
		String givenString2 = sc.nextLine();
		char charaterArray[]=givenString1.toCharArray();
		char charaterArray1[]=givenString2.toCharArray();
		AnagramOrNot r = new AnagramOrNot(charaterArray,charaterArray1);
		String c=r.is();
		System.out.print("\nGiven non repeating character is: ");
		for(int j=0;j<c.length();j++)
		{
			System.out.print(c.charAt(j)+"");
		}
	}

}
