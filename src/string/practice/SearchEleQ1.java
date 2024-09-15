/*
 * 1.enter a string by user and search particular element are present or not
 */
package string.practice;

import java.util.Scanner;

public class SearchEleQ1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String s = sc.nextLine();
		System.out.println("Enter given element to search: ");
		String element = sc.nextLine();
		if(s.contains(element))
		{
			System.out.println("Given element is present");
		}
		else
		{
			System.out.println("Given element is not present");
		}
	}

}
