/*
 * 24. Remove Vowels  
    Input: `"beautiful"`  
    Output: `"btfl"`

 */
package string.practice;

public class RemoveVowels 
{
	public static void isRV(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='a' || sb.charAt(i)=='e' || sb.charAt(i)=='i' || sb.charAt(i)=='o' || sb.charAt(i)=='u')
			{
				sb.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		String s="beautiful";
		isRV(s);
	}
}
