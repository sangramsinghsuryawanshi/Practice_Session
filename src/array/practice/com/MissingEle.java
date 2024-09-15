/*
 * Question: What is the output when finding the missing number in the array [1, 2, 4, 5] which should contain numbers from 1 to 5?

Output: 3
 */
package array.practice.com;

import java.util.Scanner;

public class MissingEle 
{
	public static int isMissing(int a[])
	{
		int l=a.length+1;
		int f=a[0];
		int la=a[a.length-1];
		int c=l*(f+la)/2;
		int f1=0;
		for(int i=0;i<a.length;i++)
		{
			f1+=a[i];
		}
		return c-f1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[]= {1,2,4,5};
		System.out.println(isMissing(a));

	}

}
