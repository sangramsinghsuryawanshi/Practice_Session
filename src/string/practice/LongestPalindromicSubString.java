/*
 * 4. Longest Palindromic Substring  
   Input: `"babad"`  
   Output: `"bab"` (or `"aba"`)
 */
package string.practice;

public class LongestPalindromicSubString 
{
	public static void isLongPalSub(String str)
	{
		int max=Integer.MIN_VALUE;
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			String s="";
			for(int j=i;j<str.length();j++)
			{
				s=str.substring(i, j+1);
				StringBuffer sb = new StringBuffer(s);
				sb.reverse();
				if(sb.toString().equals(s))
				{
					if(s.length()>max)
					{
						max=s.length();
						s1=s;
					}
				}
			}
		}
		System.out.println("Longest Palindromic Substring: "+s1);
	}
	public static void main(String[] args) 
	{
		String str="babad";
		System.out.println("Given String is: "+str);
		isLongPalSub(str);
	}
}
