/*
 * 18. Find the Kth Largest Element in an Array
    - Input: `[3, 2, 1, 5, 6, 4]`, `K = 2`
    - Output: `5`
 */
package array.practice.com;

import java.util.Arrays;
import java.util.Collections;

public class FindKthLargestEle 
{
	public static void isLarge(Integer a[],int k)
	{
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(a[k-1]);
	}
	public static void main(String[] args) 
	{
		Integer a[]= {3, 2, 1, 5, 6, 4};
		int k=2;
		isLarge(a, k);
	}
}
