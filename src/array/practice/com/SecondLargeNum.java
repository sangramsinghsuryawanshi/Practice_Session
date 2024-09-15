/*
 * Question: What is the output of finding the second largest number in the array [4, 5, 1, 2, 9]?

Output: 5
 */
package array.practice.com;

public class SecondLargeNum 
{
	public static int isSeconMax(int a[])
	{
		int max =Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secMax=max;
				max=a[i];
			}
			else if(a[i]>secMax && secMax!=max)
			{
				secMax=a[i];
			}
		}
		return secMax;
	}
	public static void main(String[] args) 
	{
		int a[]= {4, 5, 1, 2, 9};
		System.out.println("Second largest: "+isSeconMax(a));
	}

}
