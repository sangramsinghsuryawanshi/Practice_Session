/*
 * Question: What is the output of finding the maximum value in the array [2, 7, 9, 1, 5]?

Output: 9
 */
package array.practice.com;

public class MaxValueInArray 
{
	public static int isMax(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 7, 9, 1, 5};
		System.out.println("Max is: "+isMax(a));
	}

}
