/*
 * 
Q9.Given an array of integers. All numbers occur twice except one number which occurs once. Find the number in O(n) time & constant extra space.

Example : 

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2
 */
package array.practice.com;

import java.util.Scanner;

public class PrintFirstEle 
{
	public int isPrint(int a[])
	{
		int cnt=0,ele=-1,c=0;;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				cnt++;
			}
			if(cnt==0 && ele==-1)
			{
				c=a[i];
			}
			ele++;
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
		PrintFirstEle p = new PrintFirstEle();
		int b=p.isPrint(a);
		System.out.println("Given element is: "+b);
	}

}
