package array.practice.com;

import java.util.Scanner;

public class RepalceEachDigitWithNebourAdd 
{
	public static StringBuilder isNe(int a[])
	{
		StringBuilder sb = new StringBuilder();
		sb.append(0+a[0]);
		for(int i=1;i<a.length-1;i++)
		{
			sb.append(a[i+1]+a[i-1]);
		}
		sb.append(0+a[a.length-1]);
		return sb;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n-----------------------");
		StringBuilder sb=isNe(a);
		System.out.print("\nGiven element is: "+sb);
	}

}
