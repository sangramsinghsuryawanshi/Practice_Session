package string.practice;

import java.util.Scanner;

public class ReverseString {

	 ReverseString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String s=sc.nextLine();
		char[] ch= new char[s.length()];
		int ind=0;
		for(int i=s.length()-1;i>=0;i--) {
			ch[ind]=s.charAt(i);
			ind++;
		}
		for(int i=0;i<s.length();i++) {
			System.out.println(ch[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString r = new ReverseString();
	}
}
