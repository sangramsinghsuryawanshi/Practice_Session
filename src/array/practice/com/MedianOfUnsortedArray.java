/*
 * 3. Find the Median of an Unsorted Array
   - Input: `[5, 3, 1, 4, 2]`
   - Output: `3`

 */
package array.practice.com;

public class MedianOfUnsortedArray 
{
	public static int isMUA(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) 
	{
		int a[]= {5, 3, 1, 4, 2};
		System.out.println("Median is: "+isMUA(a));
	}
}
