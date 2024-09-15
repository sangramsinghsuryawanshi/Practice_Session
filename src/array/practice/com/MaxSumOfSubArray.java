/*
 * explain Question: What is the output of finding the maximum sum of a subarray in [3, -2, 5, -1]?

Output: 6 (from subarray [3, -2, 5])
 */
package array.practice.com;

public class MaxSumOfSubArray 
{
	public static int isMaxSubArraySum(int a[])
	{
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				sum=0;
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
				}
				if(sum>max)
				{
					max=sum;
				}
			}
			
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3, -2, 5, -1};
		System.out.println("Sum: "+isMaxSubArraySum(a));

	}

}
