/*
 * 24. Find the Maximum Sum Subarray with Exactly K Elements
    - Input: `[2, 1, 5, 1, 3, 2]`, `K = 3`
    - Output: `9` (Sum of `[5, 1, 3]`)

 */
package array.practice.com;

public class FindMaxSumOfKValueInSubarray
{
	public static void isSubSum(int a[],int l)
	{
		int max=0;
		String temp="";
		for(int i=0;i<a.length-l;i++)
		{
			int sum=0;
			String s="";
			for(int j=i;j<i+l;j++)
			{
				sum+=a[j];		
				s+=a[j]+" ";
			}
			if(sum>max)
			{
				max=sum;
				temp=s;
			}	
		}
		System.out.println("Maximum sum: " + max + ", Subarray: [" + temp.trim() + "]");
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 1, 5, 1, 3, 2};
		int k=3;
		isSubSum(a,k);
	}
}
