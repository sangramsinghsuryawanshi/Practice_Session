/*
 * 23. Check for Balanced Parentheses  
    Input: `"({[()]})"`  
    Output: `true`

 */
package string.practice;

import java.util.Stack;

public class CheckBalancedBrackets 
{
	public static boolean isCBP(String s)
	{
		char ch[]=s.toCharArray();
		Stack<Character> st = new Stack<>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{')
			{
				st.push(ch[i]);
			}
			else
			{
				if(st.isEmpty())
				{
					return false;
				}
				else
				{
					char c=st.pop();
					if((ch[i]==')' && c!='(') || (ch[i]==']' && c!='[') || (ch[i]=='}' && c!='{'))
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
		String s="{}{}{}{{{}}}";
		if (isCBP(s)) 
		{
			System.out.println("Balanced..!");
		}
		else
		{
			System.out.println("Not Balanced..!");
		}
	}
}
