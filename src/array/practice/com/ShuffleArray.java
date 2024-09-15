/*
 * 2.Write a Java program to shuffle a given array of integers.  
Example:
Input :
nums = { 1, 2, 3, 4, 5, 6 }
Output:
Shuffle Array: [4, 2, 6, 5, 1, 3]

 */
package array.practice.com;

import java.util.Random;
import java.util.Scanner;

public class ShuffleArray 
{
	public int[] isShuffle(int a[])
	{
		Random r = new Random();
		for(int i=0;i<a.length;i++)
		{
			int ind=r.nextInt(a.length);
			int t=a[i];
			a[i]=a[ind];
			a[ind]=t;
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
		ShuffleArray p = new ShuffleArray();
		int b[]=p.isShuffle(a);
		System.out.print("\nGiven element is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}

