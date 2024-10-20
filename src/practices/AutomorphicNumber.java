package practices;

import java.util.Scanner;

public class AutomorphicNumber 
{

	AutomorphicNumber(int n)
	{
		int sq=n*n;
		int c=0;
		double lastdigit=0.0d;
		for(int i=n;i!=0;i=i/10)
		{
			c++;
		}
		lastdigit=(double)(sq%(Math.pow(10, c)));
		System.out.println(lastdigit);
		if(lastdigit==n)
		{
			System.out.println("Automorphic number: ");
		}
		else
		{
			System.out.println("Not automorphic number");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n= sc.nextInt();
		
		AutomorphicNumber v = new AutomorphicNumber(n);
	}

}