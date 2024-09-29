/*
 * 21. Longest Repeated Subsequence  
    Input: `"AABEBCDD"`  
    Output: `"ABD"`

 */
package string.practice;

public class LongestSubsequence 
{
	public static void isLRS(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]='0';
				}
			}
			if(cnt>0 && ch[i]!='0')
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		String s="AABEBCDD";
		isLRS(s);
	}
}
