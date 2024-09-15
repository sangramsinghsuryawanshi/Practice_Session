/*
 * Reverse a Number Using a Loop:

Write a Java program to reverse an integer using a loop. Explain the logic behind it.
 */
package array.practice.com;

import java.util.Arrays;

public class ReverseInteger 
{
	public static int[] isReverse(int a[])
	{
		Arrays.sort(a);
		return a;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,4,5,8,2,8,9};
		System.out.println(Arrays.toString(isReverse(a)));
	}
}
