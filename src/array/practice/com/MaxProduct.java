/*
 * 1. Find the Maximum Product of Two Elements
   - Input: `[1, 4, 3, 7, 6]`
   - Output: `28` (Product of 4 and 7)
 */
package array.practice.com;

public class MaxProduct 
{
	public static String isMax(int a[])
	{
		int max=Integer.MIN_VALUE;
		int sMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				sMax=max;
				max=a[i];
			}
			else if(a[i]>sMax && max!=sMax)
			{
				sMax=a[i];
			}
		}
		return max+"*"+sMax+" = "+(max*sMax);
	}
	public static void main(String[] args) 
	{
		int n[]= {1,4,3,7,6};
		System.out.println(isMax(n));
	}
}
