/*
 * Question: What is the output of checking if the array [5, 2, 9, 1] contains the element 9?

Output: true
 */
package array.practice.com;

public class CheckGivenEleIsPresentIsNot 
{
	public static boolean isPresent(int a[])
	{
		int k=9;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int a[]= {5, 2, 9, 1};
		System.out.println("output: "+isPresent(a));

	}

}
