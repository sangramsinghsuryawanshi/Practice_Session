/*
 * 6.Write a Java program to concatenate two strings.
 */
package string.practice;

import java.util.Scanner;

public class ConcatenateTwoStringQ6 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String 1: ");
		String stringOne = sc.nextLine();
		System.out.println("Enter given String 2: ");
		String stringTwo = sc.nextLine();
		stringOne = stringOne.concat(stringTwo);
		System.out.println("Given concaneted string is: "+stringOne);
	}

}
