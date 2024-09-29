/*
 * 
2. Longest Valid Parentheses  
   Input: `"(()"`  
   Output: `2` (substring is `"()"`)

 */
package string.practice;

import java.util.Stack;

public class LongestParanthesis 
{
	public static void isLVP(String s)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String s1=s.substring(i, j+1);
				System.out.println(s1);
				if(isValid(s1))
				{
					if(s1.length()>max)
					{
						max=s1.length();
					}
				}
			}
		}
		System.out.println(max);
	}
	public static boolean isValid(String s1)
	{
		Stack<Character> st = new Stack<>();
		for(int k=0;k<s1.length();k++)
		{
			if(s1.charAt(k)=='(' || s1.charAt(k)=='[' || s1.charAt(k)=='{')
			{
				st.push(s1.charAt(k));
			}
			else
			{
				if(st.isEmpty())
				{
					return false;
				}
				else
				{
					char top=st.pop();
					if((s1.charAt(k)==')' && top!='(') || (s1.charAt(k)==']' && top!='[') || (s1.charAt(k)=='}' && top!='{'))
					{
						return false;
					}
				}
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args) 
	{
		String s="(())";
		isLVP(s);
	}
}
