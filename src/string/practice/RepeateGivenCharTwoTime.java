/*
17:54
Write a Java program to create a new string repeating every character twice of a 
given string.
Sample Output:
The given string is: welcome
The new string is: wweellccoomme
Write a Java program to create a new string repeating every character twice of a 
given string.
Sample Output:
The given string is: welcome
The new string is: wweellccoomme
crz-mmxn-sds
 */

package string.practice;

import java.util.Scanner;

public class RepeateGivenCharTwoTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String s =sc.nextLine();
		char ch []=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i!=ch.length-1)
			System.out.print(ch[i]+""+ch[i]);
			else{
				System.out.println(ch[i]);
			}
		}
	}

}
