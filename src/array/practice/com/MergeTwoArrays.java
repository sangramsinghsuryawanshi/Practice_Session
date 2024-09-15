package array.practice.com;

import java.util.Arrays;

public class MergeTwoArrays 
{
	public static int[] isMerge(int a[],int b[])
	{
		int x=0,y=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[y++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[y++]=b[i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9};
		System.out.println(Arrays.toString(isMerge(a, b)));
	}

}
