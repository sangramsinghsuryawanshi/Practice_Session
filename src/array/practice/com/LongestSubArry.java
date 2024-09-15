/*
 * Question: What is the output of finding the longest increasing subsequence in the array [10, 22, 9, 33, 21, 50, 41, 60, 80]?

Output: 6 (the subsequence [10, 22, 33, 50, 60, 80])
 */
package array.practice.com;

public class LongestSubArry 
{
	public static int longestIncresing(int a[])
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		int a[]= {10, 22, 9, 33, 21, 50, 41, 60, 80};
		longestIncresing(a);
	}
}
