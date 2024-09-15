package practices;

import java.util.Scanner;

public class PrimeReturnType 
{
	public static String palindromeOrNot(int n)
	{
		int rem=0,rev=0;
		for(int i=n;i!=0;i=i/10)
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		 if(rev==n)
		{
			 return "palindrome";
		}
		 else
		 {
			 return "not palindrome";
		 }
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n= sc.nextInt();
		
		PrimeReturnType v = new PrimeReturnType();
		System.out.println(v.palindromeOrNot(n));
	}

}
