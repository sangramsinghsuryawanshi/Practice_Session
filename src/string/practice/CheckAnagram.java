/*
 * 
2. Anagram Check  
   Input: `"listen", "silent"`  
   Output: `true`
 */
package string.practice;

import java.util.Arrays;

public class CheckAnagram 
{
	public static String isanagram(String str,String s)
	{
		char ch[]=str.toCharArray();
		char ch1[]=s.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		str = new String(ch);
		s = new String(ch1);
		if(str.equals(s))
		{
			return "Given Strings is Anagram..!";
		}
		else
		{
			return "Given Strings is not Anagram..!";
		}
	}
	public static void main(String[] args) 
	{
		String str="listen";
		String s="silent";
		System.out.println("Words are: "+str+", "+s);
		System.out.println(isanagram(str, s));
	}

}
