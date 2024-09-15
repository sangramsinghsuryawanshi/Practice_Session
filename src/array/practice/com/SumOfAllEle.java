/*
 * Question: What is the output of finding the sum of all elements in the array [2, 4, 6, 8]?

Output: 20
 */
package array.practice.com;

public class SumOfAllEle 
{
	public static int isSum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 4, 6, 8};
		System.out.println("Sum of all element is: "+isSum(a));
	}

}
