/*
 * 5. Find the Duplicate Element in an Array
   - Input: `[1, 3, 4, 2, 2]`
   - Output: `2`
 */
package array.practice.com;

public class FindDupicateArray 
{
	public static void isDuplicate(int a[])
	{
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
			if(cnt>1 && a[i]!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 3, 4, 2, 2};
		isDuplicate(a);
	}
}
