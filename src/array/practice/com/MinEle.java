/*
 * Question: What is the output of finding the smallest element in the array [6, 3, 8, 1, 4]?

Output: 1
 */
package array.practice.com;

public class MinEle 
{
	public static int isMin(int a[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		int a[]= {6, 3, 8, 1, 4};
		System.out.println("Min is: "+isMin(a));
	}

}
