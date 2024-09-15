/*
 * wap to merge 2 arrays using return type method
 */
package array.practice.com;

import java.util.Scanner;

public class ReturnType 
{
	public int[] retrunType(int c[])
	{
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int c[]=new int[a.length+b.length];
		System.out.println("Enter first array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second array element: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[x]=b[i];
			x++;
		}
		ReturnType r = new ReturnType();
		int d[]=r.retrunType(c);
		for(int i=0;i<c.length;i++)
		{
			d[i]=c[i];
			System.out.println(d[i]+" ");
		}
	}

}
