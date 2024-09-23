/*
 * 9. Find the Intersection of Two Arrays
   - Input: `[1, 2, 2, 1]` and `[2, 2]`
   - Output: `[2, 2]`
 */
package array.practice.com;

public class IntersectionOfTwoArray 
{
	public static void isIntern(int a[],int b[]) 
	{
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					cnt++;
				}
			}
			if(cnt>0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 2, 1};
		int b[]= {2, 2};
		isIntern(a, b);
	}
}
