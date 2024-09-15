package string.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveFirstCharInString {
	public void firstRemove(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		char ch[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ch[i]=s.charAt(i);
		}
		ch[ch.length-1]='\u0000';
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='\u0000') {
				System.out.println(ch[i]+" ");
			}
		}
		System.out.println(ch.length);
		//System.out.println(Arrays.toString(ch));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveFirstCharInString r = new RemoveFirstCharInString();
		r.firstRemove();
	}

}
