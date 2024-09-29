/*
 * 26. Check Subsequence  
    Input: `"abc", "ahbgdc"`  
    Output: `true`

 */
package string.practice;

public class CheckSubsequence 
{
	public static void isCS(String s,String s1)
	{
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s1.charAt(i)==s.charAt(j))
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		if(cnt==s.length())
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	public static void main(String[] args) 
	{
		String s="abc";
		String s1="ahbgdc";
		isCS(s,s1);
	}
}
