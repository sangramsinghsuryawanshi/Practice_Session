/*
 * 2. enter a string by user and convert it in lower case
 */
package string.practice;

import java.util.Scanner;

public class ConvertToLowerCaseQ2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		System.out.print("\nConverted into lower case: ");
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+"");
		}
	}

}
