/*
 * 9. Find the Minimum Window Substring
   - Input: `

S = "ADOBECODEBANC"`, `T = "ABC"`
   - Output: `"BANC"`

 */
package string.practice;

public class MinWindowSubstring 
{
	public static void isMWS(String s,String t)
	{
		String sa="";
		int max=Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++)
		{
			String str="";
			for(int j=i;j<s.length();j++)
			{
				str+=s.charAt(j);
				if(containsAll(str,t))
				{
					if(str.length()<max)
					{
						max=str.length();
						sa=str;
					}
				}
			}
			
		}
		System.out.println(sa);
	}
	public static boolean containsAll(String str,String t)
	{
		for(char ch:t.toCharArray())
		{
			if(str.indexOf(ch)==-1)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String s= "ADOBECODEBANC";
		String t="ABC";
		isMWS(s, t);
	}
}
