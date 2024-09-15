package array.practice.com;

import java.util.Scanner;

public class PencilPattern {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
		int n = sc.nextInt();
		int a=65,as=66,asc=67,ascii=68;
		System.out.println("---------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || i==n || i==1 || j==n)
				{
					System.out.print("* ");
				}
				else if(j==2)
				{
					System.out.print((char)(a++)+" ");
				}
				else if(j==3)
				{
					System.out.print((char)(as++)+" ");
				}
				else if(j==4)
				{
					System.out.print((char)(asc++)+" ");
				}
				else if(j==5)
				{
					System.out.print((char)(ascii++)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		int a1=75,as1=66,asc1=67;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				if(k==n || k==i)
				{
					System.out.print("* ");
				}
				else if(k==n-1)
				{
					System.out.print((char)(a1++)+" ");
				}
				else if(k==n-2)
				{
					System.out.print((char)(a1++)+" ");
				}
				else if(k==n-3)
				{
					System.out.print((char)(a1++)+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
