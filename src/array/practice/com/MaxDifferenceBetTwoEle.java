/*
 * 27. Find the Maximum Difference Between Two Elements Where Larger Element Appears After Smaller Element
    - Input: `[2, 3, 10, 6, 4, 8, 1]`
    - Output: `8` (Difference between 10 and 2)

 */
package array.practice.com;

import java.util.Arrays;

public class MaxDifferenceBetTwoEle 
{
	public static void isMax(int a[])
	{
		Arrays.sort(a);
		System.out.println(a[a.length-1]-a[1]);
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 3, 10, 6, 4, 8, 1};
		isMax(a);
	}
}
