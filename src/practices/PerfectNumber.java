package practices;

import java.util.Scanner;

public class PerfectNumber 
{
	PerfectNumber(int n)
	{
		int sum=0,rev=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(n==sum)
		{
			System.out.println("perfect number ");
		}
		else
		{
			System.out.println("not perfect number ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n= sc.nextInt();
		
		PerfectNumber v = new PerfectNumber(n);
	}

}
