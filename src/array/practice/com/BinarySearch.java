package array.practice.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch 
{
	public static void isBS(int a[],int t)
	{
		List<Integer> li = new ArrayList<>();
		for(int n:a)
		{
			li.add(n);
		}
		if(Collections.binarySearch(li, t)>=0)
		{
			System.out.println("Element found in: "+Collections.binarySearch(li, t));
		}
		else
		{
			System.out.println("Element Not found in: ");
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		int t=0;
		isBS(a, t);
	}
}
