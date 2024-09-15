/*
 * 7.Write a Java program to compare two strings using equalignore case.
 */
package string.practice;

import java.util.Scanner;

public class CompareTwoUsingEqualIgnoreCaseQ7 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String 1: ");
		String stringOne = sc.nextLine();
		System.out.println("Enter given String 2: ");
		String stringTwo = sc.nextLine();
		if(stringOne.equalsIgnoreCase(stringTwo))
		{
			System.out.println("Given element is equal");
		}
		else
		{
			System.out.println("Given element is not equal");
		}
	}
}
