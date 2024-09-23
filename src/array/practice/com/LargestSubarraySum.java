/*
 * 15. Find the Largest Sum Contiguous Subarray (Kadane's Algorithm)
    - Input: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`
    - Output: `6` (Sum of `[4, -1, 2, 1]`)
 */
package array.practice.com;

public class LargestSubarraySum 
{
	public static void isLonsum(int a[])
	{
		int max=Integer.MIN_VALUE;
		String temp="";
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				int sum=0;
				String str="";
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					str+=a[k]+" ";
				}
				if(sum>max)
				{
					max=sum;
					temp=str;
				}
			}
			
		}
		System.out.println(max);
		System.out.println(temp);
	}
	public static void main(String[] args) 
	{
		int a[]= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		isLonsum(a);
	}
}
