/*
 * 2. Find the Longest Consecutive Sequence
   - Input: `[100, 4, 200, 1, 3, 2]`
   - Output: `4` (Sequence `[1, 2, 3, 4]`)

 */
package array.practice.com;

import java.util.Arrays;

public class LongestConjicutiveSequenceOfArray 
{
	public static int isLCS(int a[])
	{
		Arrays.sort(a);
		StringBuffer sb = new StringBuffer();
		int cnt=0;
		if(a[0]<a[1])
		{
			cnt++;
			sb.append(a[0]).append(" ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[j]-a[i]==1)
				{
					cnt++;
					sb.append(a[j]).append(" ");
				}
			}
		}
		System.out.println(sb);
		return cnt;
	}
	public static void main(String[] args) 
	{
		int a[]= {100, 4, 200, 1, 3, 2};
		System.out.println("LCS is: "+isLCS(a));
	}
}
