/*
 * 1. Arrays
Find the maximum product of two integers in an array:

Input: [1, 10, 2, 6, 5, 3]
Output: 60 (since the maximum product is 10 * 6)
Rotate an array by k positions:

Input: Array: [1, 2, 3, 4, 5, 6, 7], k = 3
Output: [5, 6, 7, 1, 2, 3, 4]
 */
package practices;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListMaxPro 
{
	public static int isMaxP(ArrayList<Integer>a)
	{
		int max=Integer.MIN_VALUE;
		int sMax=Integer.MIN_VALUE;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)>max)
			{
				sMax=max;
				max=a.get(i);
			}
			else if(a.get(i)>sMax && max!=a.get(i))
			{
				sMax=a.get(i);
			}
		}
		return max*sMax;
	}
	public static void isRoate(ArrayList<Integer>a)
	{
		int k=3;
		for(int i=1;i<=k;i++)
		{
			int temp=a.get(a.size()-1);
			for(int j=a.size()-1;j>0;j--)
			{
				a.set(j, a.get(j-1));
			}
			a.set(0, temp);
			System.out.println(a);
		}
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int s = sc.nextInt();
		System.out.println("Enter array element: ");
		for(int i=0;i<s;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println("Given Max Product is: "+isMaxP(a));
		isRoate(a);
		sc.close();
	}
}
