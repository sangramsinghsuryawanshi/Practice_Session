/*
 * 5.⁠ ⁠Write a Java program to check if a given number can be expressed as the difference of two prime numbers.
Example:

Input: 6
Output:
6 = 13 - 7
6 = 11 - 5

 */
package practices;

import java.util.ArrayList;
import java.util.Scanner;

public class DiffrenceOfTwoNumbers 
{
	public static void isSumOfDiff(int n)
	{
		ArrayList<Integer> li = new ArrayList<>();
		for(int i=1;i<=n*3;i++)
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
			for(int j=i+1;j<li.size();j++)
			{
				sum=li.get(j)-li.get(i);
				if(sum==n)
				{
					System.out.println(li.get(i)+" - "+li.get(j)+" = "+n);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given number: ");
		int n=sc.nextInt();
		isSumOfDiff(n);
	}
}
