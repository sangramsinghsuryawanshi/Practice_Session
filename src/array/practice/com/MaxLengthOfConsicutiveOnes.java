/*
 * 13. Find the Maximum Length of Consecutive Ones in a Binary Array
    - Input: `[1, 1, 0, 1, 1, 1]`
    - Output: `3`

 */
package array.practice.com;

public class MaxLengthOfConsicutiveOnes 
{
	public static void idMLC(int a[])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					cnt++;
				}
				else
				{
					i++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 1, 0, 1, 1, 1};
		idMLC(a);
	}
}
