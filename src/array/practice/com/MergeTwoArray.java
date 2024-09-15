/*
 * Question: What is the output when merging two arrays [1, 3, 5] and [2, 4, 6]?

Output: [1, 2, 3, 4, 5, 6]
 */
package array.practice.com;

import java.util.Arrays;

public class MergeTwoArray 
{
	public static int[] isMerge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[x++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[x++]=b[i];
		}
		Arrays.sort(c);
		return c;
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 3, 5};
		int b[]= {2, 4, 6};
		System.out.println("Merge Array: "+Arrays.toString(isMerge(a, b)));

	}

}
