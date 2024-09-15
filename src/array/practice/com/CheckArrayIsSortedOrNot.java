/*
 * Question: What is the output of checking if the array [1, 2, 3, 4, 5] is sorted?

Output: true
 */
package array.practice.com;

public class CheckArrayIsSortedOrNot 
{
	public static boolean isSort(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		System.out.println(isSort(a));
	}

}
