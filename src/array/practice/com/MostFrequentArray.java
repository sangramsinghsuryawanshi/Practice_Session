/*
 * 15. Find the Most Frequent Element in an Array
    - Input: `[1, 3, 3, 2, 2, 2, 1]`
    - Output: `2`

 */
package array.practice.com;

public class MostFrequentArray 
{
	public static void idMLC(int a[])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=0;
				}
			}
			if(cnt>max && a[i]!=0)
			{
				max=cnt;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 3, 3, 2, 2, 2, 1};
		idMLC(a);
	}
}
