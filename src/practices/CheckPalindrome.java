/*
 * Check for Palindrome:

Write a Java program to check if a given string or number is a palindrome using a loop.
 */
package practices;

public class CheckPalindrome 
{
	public static String isPalindrome(int n)
	{
		int temp=n;
		int rev=0,rem=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		if(rev==n)
		{
			return "Given number is palindrome";
		}
		else
		{
			return "Given number is not palindrome";
		}
	}
	public static void main(String[] args) 
	{
		int n=121;
		System.out.println(isPalindrome(n));
	}
}
