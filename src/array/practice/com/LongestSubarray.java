/*
 * 25. Find the Longest Subarray with Sum Equal to K
    - Input: `[1, 2, 3, 4, 5]`, `K = 9`
    - Output: `[2, 3, 4]`

 */
package array.practice.com;

public class LongestSubarray 
{
	public static void isSumK(int a[],int l)
	{
		int temp=0;
		String s="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				String str="";
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					str+=a[k]+" ";
				}
				if(sum==l && str.length()>temp)
				{
					temp=str.length();
					s=str;
				}
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 4, 5};
		int k=9;
		isSumK(a, k);
	}
}
