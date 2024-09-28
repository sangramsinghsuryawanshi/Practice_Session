/*
 * 18. Find the Maximum Sum Subarray with a Length of K
    - Input: `[1, 2, 3, 4, 5]`, `K = 2`
    - Output: `9` (Sum of `[4, 5]`)

 */
package array.practice.com;

public class LongestKlenghtSubArray 
{
	public static void isLCS(int a[])
	{
		int t=2;
		int max=0;
		String str="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				String s="";
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					s+=a[k];
				}
				if(sum>max && s.length()==t)
				{
					max=sum;
					str=s;
				}
			}
		}
		System.out.println(str);
		System.out.println(max);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 4, 5};
		isLCS(a);
	}
}
