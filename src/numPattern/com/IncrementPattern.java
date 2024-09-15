package numPattern.com;

import java.util.Scanner;

public class IncrementPattern 
{
	public static void isIncrement(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+++" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		IncrementPattern.isIncrement(n);
	}

}