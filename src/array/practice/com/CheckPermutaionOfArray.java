/*
 * 20. Check if Two Arrays Are Permutations of Each Other
    - Input: `[1, 2, 3]` and `[3, 2, 1]`
    - Output: `true`

 */
package array.practice.com;

import java.util.Arrays;

public class CheckPermutaionOfArray 
{
	public static boolean isPer(int a[],int b[])
	{
		Arrays.sort(b);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3};
		int b[]= {3, 2, 1};
		System.out.println(isPer(a, b));
	}
}
