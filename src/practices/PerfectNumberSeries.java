package practices;

import java.util.Scanner;

public class PerfectNumberSeries 
{

	PerfectNumberSeries(int n)
	{
		System.out.println("perfect number: ");
		for(int i=1;i<=n;i++)
		{
			int sum=0,rev=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum+=j;
				}
			}
			if(i==sum)
			{
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range number: ");
		int n= sc.nextInt();
		
		PerfectNumberSeries v = new PerfectNumberSeries(n);
	}

}