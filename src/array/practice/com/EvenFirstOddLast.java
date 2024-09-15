/*
 * Q10.Given an array arr[] of integers, segregate even and odd numbers in the array. Such that all the even numbers should be present first, and then the odd numbers.

Examples:  

Input: arr[] = 1 9 5 3 2 6 7 11
Output: 2 6 5 3 1 9 7 11

 */
package array.practice.com;

import java.util.Scanner;

public class EvenFirstOddLast 
{

	public int[] isEvenOdd(int a[],int size)
	{
		int b[]=new int[size];
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[cnt++]=a[i];
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				b[cnt++]=a[i];
			}
			
		}
		return b;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter given array element: ");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		EvenFirstOddLast p = new EvenFirstOddLast();
		int b[]=p.isEvenOdd(a,size);
		System.out.print("\nGiven element is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}

