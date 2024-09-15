/*
 * 
5. Write a Java program to find maximum difference between two elements in a given array of integers such that smaller element appears before larger element.

Example:
Input :
nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 }
Output:
The maximum difference between two elements of the said array elements
10

 */
package array.practice.com;

import java.util.Scanner;

public class MaxDiff {

	public int isMaxDiff(int a[])
	{
		int max=0,min=Integer.MAX_VALUE;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
			c=max-min;
		}
		return c;
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
		MaxDiff p = new MaxDiff();
		int s=p.isMaxDiff(a);
		System.out.println("Max Diffrence is: "+s);
	}

}

