/*
 * 11. Find the Kth Smallest Element in a Sorted Matrix
    - Input: `[[1, 5, 9], [10, 11, 13], [12, 13, 15]]`, `K = 8`
    - Output: `13`

 */
package matrix.com;

import java.util.Arrays;

public class KthSmallEle 
{
	public static void isKSmall(int a[][])
	{
		int k=8;
		int b[]=new int[a.length*a.length];
		int cnt=0;
		for(int i=0;i<a.length;i++)
	    {
	       	for(int j=0;j<a[i].length;j++)
	       	{
	       		b[cnt++]=a[i][j];
        	}
	    }
		Arrays.sort(b);
		System.out.println(b[k-1]+" ");
	}
	public static void main(String[] args) 
	{
		int a[][]= {{1, 5, 9},{10, 11, 13},{12, 13, 15}};
		isKSmall(a);
	}
}
