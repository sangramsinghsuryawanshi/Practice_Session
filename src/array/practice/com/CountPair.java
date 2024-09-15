/*
 * 12. Count pairs with given sum
nput:  arr[] = {1, 5, 7, -1}, sum = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

Input:  arr[] = {1, 5, 7, -1, 5}, sum = 6
Output:  3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).

 */
package array.practice.com;

import java.util.Scanner;

public class CountPair 
{
	public void isPair(int a[]) 
	{
		int k=6;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==k)
				{
					System.out.println(a[i]+" "+a[j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		CountPair f = new CountPair();
		f.isPair(a);
	}
}