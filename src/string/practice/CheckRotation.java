/*
 * 10. Check for Rotation  
    Input: `"waterbottle", "erbottlewat"`  
    Output: `true`
 */
package string.practice;

import java.util.Arrays;

public class CheckRotation 
{
	public static String isCheckRotation(String str,String s)
	{
		char ch[]=str.toCharArray();
		char ch1[]=s.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		str = new String(ch);
		s = new String(ch1);
		if(str.equals(s))
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
		String str="waterbottle";
		String s="erbottlewat";
		System.out.println("Words are: "+str+", "+s);
		System.out.println("Check for Rotation");
		System.out.println(isCheckRotation(str, s));
	}

}
