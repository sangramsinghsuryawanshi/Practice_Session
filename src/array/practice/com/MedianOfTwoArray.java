/*
 * 19. Find the Median of Two Sorted Arrays
    - Input: `[1, 3]` and `[2]`
    - Output: `2`
 */
package array.practice.com;

public class MedianOfTwoArray 
{
	public static void isMedian(int a[],int b[])
	{
		int sum=0,sum2=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			sum2+=a[i];
		}
		System.out.println((sum+sum2)/(a.length+b.length));
	}
	public static void main(String[] args) 
	{
		int a[]= {1,3};
		int b[]= {2};
		isMedian(a, b);
	}
}
