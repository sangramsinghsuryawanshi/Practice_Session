/*
 * Q16.Wap enter a string and print substring of any given range.
 */
package string.practice;

import java.util.Scanner;

public class PrintSubstring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		StringBuilder s = new StringBuilder(sc.nextLine());
		System.out.print("\nGiven String is: "+s.substring(2, 6));
	}

}
