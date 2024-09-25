/*
 * 13. Count Substring Occurrences  
    Input: `"aaaa", "aa"`  
    Output: `3`
 */
package string.practice;

public class OccurenceOfSubstring 
{
	public static void isOccu(String str,String s)
	{
		String s1="";
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				s1=str.substring(i,j);
				if(s1.equals(s))
				{
					cnt++;
				}
			}
			
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) 
	{
		String str="aaaaa";
		String str1="aa";
		System.out.println("Given Word is: "+str+", "+str1);
		isOccu(str, str1);
	}
}
