/*
 * 2. WAP to print the factorial of each prime digit from the inputted number

   Input: 1234

   Output: 1264 (since 1 and 4 are not primes, 2 -> 2, 3 -> 6)

 */
package practices;

import java.util.Scanner;

public class FactoOfEachPrimeDigit 
{
	public static int[] isFact(int a[])
	{
	
		for(int i=0;i<a.length;i++)
		{
			int cnt=0,n=a[i];
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				int fact=1;
				for(int k=a[i];k>=1;k--)
				{
					fact*=k;
				}
				a[i]=fact;
			}
			
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n-----------------------");
		int b[]=isFact(a);
		System.out.print("\nGiven element is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"");
		}
	}

}
