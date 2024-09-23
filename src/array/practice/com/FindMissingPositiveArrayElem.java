/*
 * 6. Find the First Missing Positive Integer
   - Input: `[3, 4, -1, 1]`
   - Output: `2`
 */
package array.practice.com;

import java.util.Arrays;

public class FindMissingPositiveArrayElem 
{
	public static void isMissing(int a[])
	{
		int temp=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0 && a[i]!=i)
			{
				temp=i;
				break;
			}
		}
		System.out.println(temp);
	}
	public static void main(String[] args) 
	{
		int a[]= {3, 4, -1, 1};
		isMissing(a);
	}
}
