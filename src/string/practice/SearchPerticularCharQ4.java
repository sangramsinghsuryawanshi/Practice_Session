/*
 * 4.enter a string by user and search particular character and print its no
 */
package string.practice;

import java.util.Scanner;

public class SearchPerticularCharQ4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String s = sc.nextLine();
		System.out.println("Enter given character to search: ");
		char ind = sc.next().charAt(0);
		System.out.print("Given index is: ");
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ind)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
