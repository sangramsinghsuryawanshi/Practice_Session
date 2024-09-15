/*
 * Factorial Calculation:

Write a program to calculate the factorial of a number using a loop.
 */
package practices;

public class FactorialOfGivenNumber 
{
	public static int isFact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		int n=4;
		System.out.println(isFact(n));
	}
}
