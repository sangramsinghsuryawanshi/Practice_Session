/*
 * 1. Reverse a String  
   Input: `"Hello World"`  
   Output: `"World Hello"`
 */
package string.practice;

public class ReverseStringAndShow 
{
	public static StringBuffer isReverse(String str)
	{
		String s[]=str.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=s.length-1;i>=0;i--)
		{
			sb.append(s[i]+" ");
		}
		return sb;
	}
	public static void main(String[] args) 
	{
		String str="The sky is blue";
		System.out.println("Given Word is: "+str);
		System.out.println("Given Reverse Word is: "+isReverse(str));
	}
}
