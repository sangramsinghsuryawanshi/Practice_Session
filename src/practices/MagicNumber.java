/*
 * 3.⁠ ⁠Write a Java Program to check if any number is a magic number or not. A number is said to be a magic number if after doing sum of digits in each step and inturn doing sum of digits of that sum, the ultimate result (when there is only one digit left) is 1.
Example, consider the number:

Step 1: 163 => 1+6+3 = 10
Step 2: 10 => 1+0 = 1 => Hence 163 is a magic number

 */
package practices;

import java.util.Scanner;

public class MagicNumber 
{
	public static void isMagic(int n)
	{
		int sum = n;
		while(sum>9)
		{
			sum=isSumOfDigits(sum);
		}
		if(sum==1)
		{
			System.out.println("Given number is magic number");
		}
		else
		{
			System.out.println("Given number is not magic number");
		}
	}
	public static int isSumOfDigits(int num)
	{
		int sum=0;
		for(;num!=0;num/=10)
		{
			sum+=num%10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int n=sc.nextInt();
		isMagic(n);
	}
}
