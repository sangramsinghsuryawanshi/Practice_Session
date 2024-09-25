/*
 * 8. Longest Substring Without Repeating Characters  
   Input: `"abcabcbb"`  
   Output: `3` (substring is `"abc"`)
 */
package string.practice;

public class LongestsubWithoutRepeatedChar 
{
	public static void isLongReSub(String str)
	{
		int max=Integer.MIN_VALUE;
		String s1="";
		for(int i=0;i<str.length();i++)
		{
			String s="";
			for(int j=i;j<str.length();j++)
			{
				s=str.substring(i, j+1);
				int cnt=1;
				for(int k=0;k<s.length();k++)
				{
					for(int l=k+1;l<s.length();l++)
					{
						if(s.charAt(k)==s.charAt(l))
						{
							cnt++;
						}
					}
				}
				if(cnt==1 && s.length()>max)
				{
					max=s.length();
					s1=s;
				}
			}
		}
		System.out.println("Longest Substring Without Repeating Characters: "+max+" "+s1);
	}
	public static void main(String[] args) 
	{
		String str="abcabcbb";
		System.out.println("Given String is: "+str);
		isLongReSub(str);
	}
}
