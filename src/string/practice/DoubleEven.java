/*
 * 4. WAP to double each digit at an even index in the inputted number (starting from 0)

   Input: 1234

   Output: 2264 (1 and 3 are at even indices, so they are doubled)

 */
package string.practice;

import java.util.Scanner;

public class DoubleEven 
{
	public static int[] isDouble(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				a[i]=a[i]*2;
			}
			
		}
		return a;
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
		int b[]=isDouble(a);
		System.out.print("\nGiven element is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"");
		}
	}

}
