/*
 * Q2.Write a Java program to print all the LEADERS in the array.
  Note: An element is leader if it is greater than all the elements to its right side.
input : 
a[] = {16, 17, 4, 3, 5, 2}, 
output :  17 5 2
 */
package array.practice.com;

public class LeaderArray 
{
	public static int[] isLeader(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]+" ");
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int a[] = {16, 17, 4, 3, 5, 2};
		isLeader(a);
	}
}