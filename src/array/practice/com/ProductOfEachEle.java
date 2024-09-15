package array.practice.com;

import java.util.Scanner;

public class ProductOfEachEle 
{

	public int[] isProduct(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			c=1;
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					c=c*a[j];
				}
			}
			System.out.print(c+" ");
		}
		return a;
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
		ProductOfEachEle p = new ProductOfEachEle();
		int b[]=p.isProduct(a);
//		System.out.print("\nGiven element is: ");
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.print(b[i]+" ");
//		}
	}
}

