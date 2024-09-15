package practices;

import java.util.Scanner;

public class StrongNumber 
{
	StrongNumber(int n)
	{
		int rem=0,sum=0;
		for(int i=n;i!=0;i=i/10)
		{
			int fact=1;
			rem=i%10;
			for(int j=1;j<=rem;j++)
			{
				fact*=j;
			}
			sum+=fact;
		}
		if(sum==n)
		{
			System.out.println("Given number is Strong number");
		}
		else
		{
			System.out.println("Given number is not Strong number");
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range number: ");
		int n= sc.nextInt();
		
		StrongNumber v = new StrongNumber(n);
	}

}