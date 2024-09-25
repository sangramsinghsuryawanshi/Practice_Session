/*

1.⁠ ⁠Write a java program to check if any number given as input is the sum of 2 prime numbers.
Example :
Input - 18
Output - 
18 = 13 + 5
18 = 11 + 7
 */
package practices;

import java.util.ArrayList;

public class CheckGivenNumSumIsPrimeOfTwoNo
{
	public static void isSum(int n)
	{
		ArrayList<Integer>li = new ArrayList<>();
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
			int sum=0;
			for(int j=i+1;j<li.size();j++)
			{
				sum=li.get(i)+li.get(j);
				if(sum==n)
				{
					System.out.println(li.get(i)+"+"+li.get(j)+"="+n);
				}
			}
		}
		//System.out.println(li);
	}
	public static void main(String[] args) 
	{
		int n=34;
		isSum(n);
	}
}
