/*
 * Q12.Given a sorted array with possibly duplicate elements. The 
 * task is to find indexes of first and last occurrences of an 
 * element X in the given array.

Note: If the element is not present in the array return {-1,-1} 
as pair.

Example 1:

Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.

 */
package array.practice.com;

import java.util.Scanner;

public class FindFirstAndLAstOccurrence 
{

	public void isOccurence(int a[])
	{
		int cnt=0,ele=-1,lele=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(ele==-1)
					{
						ele=i;
					}
					lele=i;
				}
			}
		}
		System.out.println("First occurence 5 index is: "+ele);
		System.out.println("Last occurence 5 index is: "+(lele+1));
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter given array element: ");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		FindFirstAndLAstOccurrence p = new FindFirstAndLAstOccurrence();
		p.isOccurence(a);
	}

}

