/*
 * 
12. Find All Subarrays with Sum Equal to Zero
    - Input: `[3, 4, -7, 5, -6, 2]`
    - Output: `[[3, 4, -7], [5, -6, 2]]`

 */
package array.practice.com;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubArrayWithZero 
{
	public static void isLSSE(int a[])
	{
		List<List<Integer>> li = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				List<Integer> l1 = new ArrayList<>();
				int sum=0;
				for(int l=i;l<=j;l++)
				{
					l1.add(a[l]);
					sum+=a[l];
				}
				if(sum==0)
				{
					li.add(l1);
				}
			}
		}
		System.out.println(li);
	}
	public static void main(String[] args) 
	{
		int a[]= {3, 4, -7, 5, -6, 2};
		isLSSE(a);
	}
}

