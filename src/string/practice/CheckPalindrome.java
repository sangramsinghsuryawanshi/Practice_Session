/*
 * 3. Palindrome Check  
   Input: `"madam"`  
   Output: `true`
 */
package string.practice;

public class CheckPalindrome 
{
	public static String isPal(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if(sb.toString().equals(str))
		{
			return "Given String is Palindrome..!";
		}
		else
		{
			return "Given String is not Palindrome..!";
		}
	}
	public static void main(String[] args) 
	{
		String str="madam";
		System.out.println("Word is: "+str);
		System.out.println(isPal(str));
	}
}
