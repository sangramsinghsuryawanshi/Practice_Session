/*
 * Q14.Wap enter a string and and remove first 
 * character and print final string.
 */
package string.practice;

import java.util.Scanner;

public class RemoveFirstChar {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		StringBuilder s = new StringBuilder(sc.nextLine());
		System.out.print("\nGiven String is: ");
		for(int i=0;i<s.length()-1;i++)
		{
			if(i==s.length()-1)
			{
				s.deleteCharAt(i);
			}
			System.out.print(s.charAt(i));
		}
	}

}
