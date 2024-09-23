/*
 * 21. Find the Longest Common Prefix in an Array of Strings
    - Input: `["flower", "flow", "flight"]`
    - Output: `"fl"`

 */
package string.practice;

public class LongestCommonPrefix 
{
	public static void isPrefix(String str)
	{
		String s[]=str.split(" ");
		String t=s[0];
		for(int i=1;i<s.length;i++)
		{
			while(s[i].indexOf(t)!=0)
			{
				t=t.substring(0, t.length()-1);
			}
		}
		System.out.println(t+" ");
	}
	public static void main(String[] args) 
	{
		String str="flower flow flight";
		isPrefix(str);
	}
}
