/*
 * 16. Check Valid Shuffle  
    Input: `"abc", "def", "dabecf"`  
    Output: `true`
 */
package string.practice;

import java.util.Arrays;

public class ValidShuffle 
{
	public static String isValShuff(String s,String s1,String s2)
	{
		String s3=s.concat(s1);
		char ch[]=s2.toCharArray();
		char ch1[]=s3.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		s = new String(ch);
		s3 = new String(ch1);
		if(s.equals(s3))
		{
			return "true";
		}
		else
		{
			return "false";
		}
	}
	public static void main(String[] args) 
	{
		String str="abc";
		String str1="def";
		String str2="dabecf";
		System.out.println("Given string is: "+str+", "+str1+", "+str2);
		System.out.println(isValShuff(str, str1, str2));
	}
}
