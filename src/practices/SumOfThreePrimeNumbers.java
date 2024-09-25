/*
 * 4.⁠ ⁠Write a Java program to check if any number given as input can be represented as the sum of three prime numbers.
Example:

Input: 23
Output:
23 = 17 + 3 + 3

 */
package practices;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfThreePrimeNumbers 
{
	public static void isSumOfthree(int n)
	{
		ArrayList<Integer> li = new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				li.add(i);
			}
		}
		int sum=0;
		for(int i=0;i<li.size();i++)
		{
			for(int j=i;j<li.size();j++)
			{
				for(int k=j;k<li.size();k++)
				{
					sum=li.get(i)+li.get(j)+li.get(k);
					if(sum==n)
					{
						System.out.println(li.get(i)+" + "+li.get(j)+" + "+li.get(k)+" = "+n);
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int n=sc.nextInt();
		isSumOfthree(n);
	}
}
