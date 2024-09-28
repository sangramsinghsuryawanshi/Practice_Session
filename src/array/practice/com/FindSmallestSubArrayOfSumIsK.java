/*
 * 6. Find the Smallest Subarray with Sum Greater than or Equal to K
   - Input: `[2, 3, 1, 2, 4, 3]`, `K = 7`
   - Output: `2` (Length of `[4, 3]`)

 */
package array.practice.com;

public class FindSmallestSubArrayOfSumIsK 
{
	public static int isNOSSM(int a[],int k)
	{
		int min=Integer.MAX_VALUE;
		String str="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int sum=0,cnt=0;
				String s="";
				for(int l=i;l<=j;l++)
				{
					sum+=a[l];
					cnt++;
					s+=a[l]+" ";
				}
				if(sum>=k && cnt<min)
				{
					min=cnt;
					str=s;
				}
			}
		}
		System.out.println(str);
		return min;
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 3, 1, 2, 4, 3};
		int k=7;
		System.out.println(isNOSSM(a, k));
	}
}