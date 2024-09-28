/*
 * 17. Find the Largest Sum Contiguous Subarray with Exactly K Elements
    - Input: `[2, 1, 5, 1, 3, 2]`, `K = 3`
    - Output: `9`

 */
package array.practice.com;

import java.util.Arrays;

public class LongestContiSubSumArray 
{
	public static int isLCS(int a[])
	{
		System.out.println(Arrays.toString(a));
		StringBuffer sb = new StringBuffer();
		int s=0;
		for(int i=0;i<3;i++)
		{
			s+=a[i];
		}
		int cu=s,m=0;
		for(int i=3;i<a.length;i++)
		{
			cu+=a[i]-a[i-3];
			m=Math.max(m, cu);
		}
		return m;
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 1, 5, 1, 3, 2};
		System.out.println("LCS is: "+isLCS(a));
	}
}
