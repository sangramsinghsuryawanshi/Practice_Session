/*
 * 
17. Longest Common Substring  
    Input: `"abcdef", "abfgh"`  
    Output: `"ab"`

 */
package string.practice;

public class LongestCommonsubstring 
{
	public static void isLCS(String s,String s1)
	{
		String s3="";
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String sub=s.substring(i, j+1);
				if(s1.contains(sub) && sub.length()>max)
				{
					s3=sub;
					max=sub.length();
				}
			}
		}
		System.out.println(s3+" "+max);
	}
	public static void main(String[] args) 
	{
		String s="abcdef";
		String s1= "abfgh";
		isLCS(s,s1);
	}
}
