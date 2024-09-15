/*
 * Q11.Given a sorted array of n distinct integers where each 
 * integer is in the range from 0 to m-1 and m > n. Find the 
 * smallest number that is missing from the array. 

Examples:

Input: {0, 1, 2, 6, 9}, n = 5, m = 10 
Output: 3

 */
package array.practice.com;

import java.util.Scanner;

public class MissingNArray 
{
	public int isMissing(int a[],int size)
	{
		int ele =size*(size+1)/2;
		return ele;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[] = new int[size/2];
		System.out.print("Enter given array element: ");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		MissingNArray p = new MissingNArray();
		int b=p.isMissing(a,size/2);
		System.out.print("\nGiven element is: "+b);
	}

}

