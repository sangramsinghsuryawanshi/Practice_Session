
package hollow.pattern.com;

import java.util.Scanner;

public class RoadPattern 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
		int n = sc.nextInt();
		int a=65,as=78;
		System.out.println("---------------------");
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n)
				{
					System.out.print("*");
				}
				else if(j==2)
				{
					System.out.print((char)(a++)+"");
				}
				else if(j==n-1)
				{
					System.out.print((char)(as++)+"");
				}
				else if(j==4 || i==n)
				{
					System.out.print(" +");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		a=a;
		as=as;
		for(int i=2;i<=n;i++)
		{
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n)
				{
					System.out.print("*");
				}
				else if(j==2)
				{
					System.out.print((char)(a++)+"");
				}
				else if(j==n-1)
				{
					System.out.print((char)(as++)+"");
				}
				else if(j==4)
				{
					System.out.print("+");
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
