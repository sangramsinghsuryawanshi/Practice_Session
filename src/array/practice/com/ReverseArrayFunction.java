package array.practice.com;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayFunction 
{
	public static Integer[] isReverse(Integer a[])
	{
		Arrays.sort(a, Collections.reverseOrder());
		return a;
	}
	public static void main(String[] args) 
	{
		Integer a[]= {3,7,3,8,9,4};
		System.out.println("Reverse: "+Arrays.toString(isReverse(a)));
		

	}

}
