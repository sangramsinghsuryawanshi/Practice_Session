package practices;

import java.util.Scanner;

public class MoveAllNegativeValurToFirst 
{
	MoveAllNegativeValurToFirst(int a[],int size)
	{
		int c=0,c1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				c++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				c1++;
			}
		}
		int b[]=new int[c];
		int d[]=new int[c1];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				b[x]=a[i];
				x++;
			}
		}
		x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				d[x]=a[i];
				x++;
			}
		}
		x=0;
		for(int i=0;i<a.length;i++)
		{
			if(i<b.length)
			{
				a[i]=b[i];
			}
			else
			{
				a[i]=d[x++];
			}
		}
		System.out.print("\nGiven array element is :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("\nEnter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		MoveAllNegativeValurToFirst m = new MoveAllNegativeValurToFirst(a,size);
	}

}
/*8. Move all negative numbers to beginning and positive to end with constant extra space
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5*/