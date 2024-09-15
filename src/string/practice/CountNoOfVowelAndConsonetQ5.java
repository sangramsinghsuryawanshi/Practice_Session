/*
 * 5.enter a string and count the no of vowel and consonent.
 */
package string.practice;

import java.util.Scanner;

public class CountNoOfVowelAndConsonetQ5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String s = sc.nextLine();
		int vowelCount=0;
		int consonetCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				vowelCount++;
			}
			else
			{
				consonetCount++;
			}
		}
		System.out.println("Number of count of in vowel is: "+vowelCount);
		System.out.println("Number of count of in consonet is: "+consonetCount);
	}

}
