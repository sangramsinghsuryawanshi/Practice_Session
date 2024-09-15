/*
 * 3.Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.  

Example:
Input :
nums= { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 }
Output:
Array with every second element is greater than its left and 
right elements:
[1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]

 */
package array.practice.com;

import java.util.Scanner;

public class UniqueEle {

	public int[] isUnique(int a[])
	{
		int c=0;
		for(int i=1;i<a.length;i+=2)
		{
			if(a[i]<a[i+1])
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		return a;
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
		UniqueEle p = new UniqueEle();
		int b[]=p.isUnique(a);
		System.out.print("\nGiven element is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}

