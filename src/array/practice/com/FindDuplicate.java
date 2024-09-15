package array.practice.com;

import java.util.Arrays;

public class FindDuplicate 
{
	public static int[] isDuplicate(int a[])
	{
		int b[]=new int[a.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					b[x++]=a[i];
				}
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,3,5,6,7,8,9,5};
		for(int i=0;i<isDuplicate(a).length;i++)
		{
			if(isDuplicate(a)[i]!=0)
			{
				System.out.print(isDuplicate(a)[i]);
			}
		}
	}

}
