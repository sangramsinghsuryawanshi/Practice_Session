/*
 * 14. Find the Maximum Value of an Array After Performing M Operations
    - Input: `[1, 2, 3, 4, 5]`, `M = 3` (Increment each element)
    - Output: `[4, 5, 6, 7, 8]`

 */
package array.practice.com;

public class MaxValueOfArray {
	public static void idMLC(int a[])
	{
		int max=0,m=3;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<a.length;i++)
		{
			if(i>=m)
			{
				sb.append(a[i]+" ");
			}
			else
			{
				max++;
			}
			
		}
		int s=sb.length()+1;
		for(int i=1;i<=max;i++)
		{
			++s;
			sb.append(s+" ");
		}
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 4, 5};
		idMLC(a);
	}
}
