/*
 * 6.⁠ ⁠Write a Java program to find all pairs of prime numbers whose product equals the given number.
Example:

Input: 55
Output:
55 = 11 * 5
 */
package practices;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductEqualsToPrime 
{
	public static void isProPrime(int n)
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
		for(int i=0;i<li.size();i++)
		{
			int pro=1;
			for(int j=i+1;j<li.size();j++)
			{
				pro=li.get(i)*li.get(j);
				if(pro==n)
				{
					System.out.println(li.get(i)+" * "+li.get(j)+" = "+n);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int n=sc.nextInt();
		isProPrime(n);
	}
}
