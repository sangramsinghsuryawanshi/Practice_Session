/*
 * 29. Find All Permutations  
    Input: `"abc"`  
    Output: `["abc", "acb", "bac", "bca", "cab", "cba"]`

 */
package string.practice;

public class FindAllPermutation 
{
	public static void isCS(String s,String per)
	{
		if(s.length()==0)
		{
			System.out.print(per+" ");
		}
		for(int i=0;i<s.length();i++)
		{
			char curChar=s.charAt(i);
			String newChar=s.substring(0, i)+s.substring(i+1);
			isCS(newChar, per+curChar);
		}
	}
	public static void main(String[] args) 
	{
		String s="abc";
		String s1="";
		isCS(s,s1);
	}
}
