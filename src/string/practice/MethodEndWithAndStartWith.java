package string.practice;

import java.util.Scanner;

public class MethodEndWithAndStartWith {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		System.out.print("\nGiven String is: "+givenString.startsWith("ja"));
		System.out.print("\nGiven String is: "+givenString.endsWith("ple"));
	}

}
