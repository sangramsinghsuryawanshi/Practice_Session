/*
 * 1. Find a peak element which is not smaller than its neighbours
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
 */
package hollow.pattern.com;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int s= sc.nextInt();
		int a[]= new int[s];
		System.out.println("Enter given element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given element is: ");
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
			{
				System.out.println(a[i]+" ");
			}
		}
	}

}
