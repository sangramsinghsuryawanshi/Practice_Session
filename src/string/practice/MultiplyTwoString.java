/*
 * 20. Multiply Two Strings  
    Input: `"123", "456"`  
    Output: `"56088"`

 */
package string.practice;

public class MultiplyTwoString 
{
	public static void isMTS(String s,String s1)
	{
		int n=Integer.parseInt(s);
		int n1=Integer.parseInt(s1);
		System.out.println(n*n1);
	}
	public static void main(String[] args) 
	{
		String s="123";
		String s1="456";
		isMTS(s, s1);
	}
}
