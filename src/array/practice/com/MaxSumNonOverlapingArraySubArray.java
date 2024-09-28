/*
 * 5. Find the Maximum Number of Non-Overlapping Subarrays with Sum K
   - Input: `[1, 1, 1, 1, 1, 1]`, `K = 2`
   - Output: `3`

 */
package array.practice.com;

public class MaxSumNonOverlapingArraySubArray 
{
	public static int isNOSSM(int a[],int k)
	{
		int sum=0,cnt=0;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
            if (sum == k) 
            {
            	cnt++; 
            	sum = 0;
            }
			
		}
		return cnt;
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 1, 1, 1, 1, 1};
		int k=2;
		System.out.println(isNOSSM(a, k));
	}
}
