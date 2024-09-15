package string.practice;

import java.util.Scanner;

public class MethodsString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		System.out.println("Trim method: "+givenString.trim());
		System.out.println("CharAt method: "+givenString.charAt(5));
		String s ="java";
		String s1 ="java";
		if(s1.compareTo(s)==0)
		{
			System.out.println("is equal");
		}
		else
		{
			System.out.println("is not equal");
		}
	}

}
