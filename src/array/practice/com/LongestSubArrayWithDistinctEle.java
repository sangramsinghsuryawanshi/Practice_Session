/*
 * 7. Find the Longest Subarray with Distinct Elements
   - Input: `[1, 2, 3, 4, 2, 3, 5]`
   - Output: `[1, 2, 3, 4, 2]` (Length is `5`)

 */
package array.practice.com;

import java.util.HashSet;

public class LongestSubArrayWithDistinctEle
{
	public static void isLSDE(int a[])
	{
		Integer max=Integer.MIN_VALUE;
		String str="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				HashSet<Integer> hi = new HashSet<>();;
				for(int l=i;l<=j;l++)
				{
					hi.add(a[l]);
				}
				if(hi.size()>max)
				{
					max=hi.size();
					str=hi.toString();
				}
			}
		}
		System.out.println(max+" "+str);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 4, 2, 3, 5};
		isLSDE(a);
	}
}
