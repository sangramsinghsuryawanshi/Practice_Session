/*
 * 
7.K’th Largest Element in Unsorted Array
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
Output: 10 

 */
package array.practice.com;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestEle 
{
	public int isLarge(int a[],Scanner sc)
	{
		Arrays.sort(a);
		int c=0;
		System.out.println("Enter kTh element: ");
		int k=sc.nextInt();
		for(int i=1;i<a.length;i++)
		{
			if((i+1)==k)
			{
				System.out.println(a[i]);
			}
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
		KthLargestEle p = new KthLargestEle();
		int s=p.isLarge(a,sc);
		//System.out.println("Max Diffrence is: "+s);
	}

}


