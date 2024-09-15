package string.practice;

import java.util.Scanner;

public class ConvertToUpperCaseQ3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String s = sc.nextLine();
		s = s.toUpperCase();
		System.out.print("\nConverted into upper case: ");
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+"");
		}
	}

}
