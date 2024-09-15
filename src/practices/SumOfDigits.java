/*
 * Sum of Digits:

How would you find the sum of digits of a given number using a loop?
 */
package practices;

public class SumOfDigits 
{
	public static int isSum(int n)
	{
		int temp=n;
		int sum=0,rev=0;
		while(temp!=0)
		{
			rev=temp%10;
			sum+=rev;
			temp=temp/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int n=145;
		System.out.println(isSum(n));
	}
}
