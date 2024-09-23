/*
 * 3. Rotate Array Left by K Positions
   - Input: `[1, 2, 3, 4, 5]`, `K = 2`
   - Output: `[3, 4, 5, 1, 2]`
 */
package array.practice.com;

import java.util.Arrays;

public class RotatesArrayBykValue 
{
	public static void isRotate(int a[],int k)
	{
		for(int i=1;i<=k;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 4, 5};
		int k=2;
		isRotate(a, k);
	}
}
