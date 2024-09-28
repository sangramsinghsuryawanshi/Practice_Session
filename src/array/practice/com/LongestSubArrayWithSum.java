/*
 * 10. Find the Longest Subarray with Sum Equal to a Target Value
    - Input: `[1, 2, 3, 4, 5]`, `Target = 9`
    - Output: `[2, 3, 4]`

 */
package array.practice.com;

public class LongestSubArrayWithSum
{
	public static void isLSSE(int a[])
	{
		Integer max=Integer.MIN_VALUE;
		String str="";
		int t=9;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				String s="";
				int sum=0;
				for(int l=i;l<=j;l++)
				{
					s+=a[l]+" ";
					sum+=a[l];
				}
				if(sum>max && sum==t)
				{
					max=sum;
					str=s;
				}
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 4, 5};
		isLSSE(a);
	}
}
