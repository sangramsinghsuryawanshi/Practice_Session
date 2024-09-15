package practices;

import java.util.Scanner;

public class TakeNEvenAndOddAndSum 
{
	TakeNEvenAndOddAndSum(int n)
	{
		int rem=0,n1=2,sum=0;
		for(int t=n;t!=0;t=t/10)
		{
			rem=t%10;
			if(rem%2==0)
			{
				sum+=rem/n1;
			}
			else
			{
				sum+=rem*n1;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an N number: ");
		int n = sc.nextInt();
		TakeNEvenAndOddAndSum t = new TakeNEvenAndOddAndSum(n);
	}

}
