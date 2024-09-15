/*
 * Question: What is the output when calculating the average of all elements in the array [10, 20, 30, 40]?

Output: 25.0
 */
package array.practice.com;

public class CalulatAverage 
{
	public static int isAvg(int a[])
	{
		int sum=0,cnt=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			cnt++;
		}
		return sum/cnt;
	}
	public static void main(String[] args) 
	{
		int a[]= {10, 20, 30, 40};
		System.out.println(isAvg(a));
	}
}
