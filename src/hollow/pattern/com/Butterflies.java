package hollow.pattern.com;

import java.util.Scanner;

public class Butterflies 
{
	public static void isBut(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			for(int k=n;k>i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i+1;j++)
			{
				if(j==i || j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				if(j==n-1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=1;k<i+1;k++)
			{
				System.out.print("  ");
			}
			for(int j=n-1;j>=i;j--)
			{
				if(j==n-1 || j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n=sc.nextInt();
		System.out.println("-------------------");
		isBut(n);
	}

}
