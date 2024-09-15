/*
 * 1. WAP to print the cube of each digit from the inputted number
   Input: 1234
   Output: 182764

 */
package array.practice.com;

import java.util.Scanner;

public class CubeOfEachDigit 
{
	public static int[] isCube(int a[])
	{
		int cube=1;
		for(int i=0;i<a.length;i++)
		{
			cube=a[i]*a[i]*a[i];
			a[i]=cube;
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
		int b[]=isCube(a);
		System.out.print("\nGiven element is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"");
		}
	}

}
