/*
 * Question: What will be the output when reversing the array [3, 6, 8, 1]?

Output: [1, 8, 6, 3]
 */
package array.practice.com;

import java.util.Arrays;

public class ReverseArray 
{
	public static int[] isReverse(int a[])
	{
		int b[]=new int[a.length];
		int x=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[x++]=a[i];
		}
		return b;
	}
	public static void main(String[] args) 
	{
		int a[] = {3, 6, 8, 1};
		System.out.println("Reverse Array: "+Arrays.toString(isReverse(a)));

	}

}
