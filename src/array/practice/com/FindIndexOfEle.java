/*
 * Question: What is the output when finding the index of the element 3 in the array [7, 3, 8, 4]?

Output: 1
 */
package array.practice.com;

public class FindIndexOfEle 
{
	public static int isInd(int a[])
	{
		int ele=4;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				return i;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) 
	{
		int a[]= {7, 3, 8, 4};
		System.out.println("Index is: "+isInd(a));
	}

}
