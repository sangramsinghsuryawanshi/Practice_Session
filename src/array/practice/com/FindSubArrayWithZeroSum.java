/*
 * 22. Find All Subarrays with Zero Sum
    - Input: `[1, 2, -3, 3]`
    - Output: `[[1, 2, -3], [-3, 3]]`

 */
package array.practice.com;

public class FindSubArrayWithZeroSum 
{
	public static void isSubSum(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum+=a[j];
				if(sum==0)
				{
					for(int k=i;k<=j;k++)
					{
						System.out.print(a[k]+" ");		
					}
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, -3, 3};
		isSubSum(a);
	}
}
