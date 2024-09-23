/*
 * 11. Find the Majority Element (more than n/2 occurrences)
    - Input: `[3, 2, 3]`
- Output: `3`
 */
package array.practice.com;

public class MajorityEle 
{
	public static void isMajority(int a[])
	{
		int n=a.length;
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=0;
				}
			}
			if(cnt>n/2 && a[i]!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {3, 2, 3};
		isMajority(a);
	}
}
