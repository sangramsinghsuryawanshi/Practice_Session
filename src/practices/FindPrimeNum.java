/*
 * 
2.⁠ ⁠Write a Java program to find all pairs of prime numbers that add up to a given even number.
Example:

Input: 34
Output:
34 = 31 + 3
34 = 17 + 17

 */
package practices;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPrimeNum 
{
	public static void isSumEven(int n) 
	{
		ArrayList<Integer> li = new ArrayList<>();
		ArrayList<Integer> li1 = new ArrayList<>();
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
			if(cnt==2 && i%2!=0)
			{
				li.add(i);
			}
		}
		for(int i=0;i<li.size();i++)
		{
			int sum=0;
			for(int j=i;j<li.size();j++)
			{
				sum=li.get(i)+li.get(j);
				if(sum==n)
				{
					System.out.println(li.get(i)+"+"+li.get(j)+"="+n);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int n=sc.nextInt();
		isSumEven(n);
	}
}
