package string.practice;

import java.util.Random;

public class RandomPassword 
{
	static final String CharPass="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	public static StringBuffer isRP(int le)
	{
		Random r = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<le;i++)
		{
			int ind=r.nextInt(CharPass.length());
			sb.append(CharPass.charAt(ind));
		}
		return sb;
	}
	public static void main(String[] args) 
	{
		int n=8;
		System.out.println(isRP(n));
	}
}
