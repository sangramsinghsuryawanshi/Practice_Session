/*
 * 30. Find the Smallest Positive Integer that Cannot be Represented by Any Subset Sum
    - Input: `[1, 1, 1, 1]`
    - Output: `5`

 */
package array.practice.com;

public class SmallestSubInteger 
{
	public static void isInt(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(++sum+" ");
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 1, 1, 1};
		isInt(a);
	}
}
