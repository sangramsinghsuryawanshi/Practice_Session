/*
 * 6. Find a peak element which is not smaller than its 
 * neighbours

Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both 
of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both 
of them are less than 20, similarly 90 has neighbors 23 and
 67.

 */
package array.practice.com;

import java.util.Scanner;

public class PeakEle 
{

	public int isPeak(int a[])
	{
		int max=0,min=Integer.MAX_VALUE;
		int c=0;
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
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
		PeakEle p = new PeakEle();
		int s=p.isPeak(a);
		//System.out.println("Max Diffrence is: "+s);
	}

}

