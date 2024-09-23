/*
 * 8. Move All Zeroes to the End
   - Input: `[0, 1, 0, 3, 12]`
   - Output: `[1, 3, 12, 0, 0]`
 */
package array.practice.com;

import java.util.Arrays;

public class MoveAllZeroToEnd 
{
	public static void isLastZero(int a[])
	{
		int b[]=new int[a.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[x++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) 
	{
		int a[]= {0, 1, 0, 3, 12};
		isLastZero(a);
	}
}
