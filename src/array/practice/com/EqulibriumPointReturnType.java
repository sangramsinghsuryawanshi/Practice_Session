package array.practice.com;

import java.util.Scanner;

public class EqulibriumPointReturnType 
{
	public int[] point(int a[])
	{
		int rsum1[]=new int[1];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			int lsum=0;
					int rsum=0;
			for(int k=0;k<i;k++)
			{
				lsum+=a[k];
			}
			for(int j=i+1;j<a.length;j++)
			{
				rsum+=a[j];
			}
			if(rsum==lsum)
			{
				rsum1[x++]=a[i];
			}
		}
		return rsum1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter first array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		EqulibriumPointReturnType e = new EqulibriumPointReturnType();
		int s[]=e.point(a);
		for(int i=0;i<s.length;i++)
		{
		
			System.out.println(s[i]+" ");
		}	
	}
}
