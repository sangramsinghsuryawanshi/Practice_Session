/*
 * Question: What is the output when rotating the array [1, 2, 3, 4] by 2 positions to the right?

Output: [3, 4, 1, 2]
 */
package array.practice.com;

import java.util.Arrays;

public class RotateArrayPositionWise 
{
	public static int[] isRoated(int a[])
	{
		int k=2;
		for(int i=1;i<=k;i++)
		{
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 4,5};
		System.out.println("Rotated: "+Arrays.toString(isRoated(a)));
	}

}
