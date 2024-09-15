package practices;

import java.util.Arrays;
import java.util.Scanner;

public class MrgeTwoArrays 
{
	public static int[] isMerge(int a[],int b[])
	{
		int c[]= new int[a.length+b.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			c[x++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[x++]=b[i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int s = sc.nextInt();
		int a[]=new int[s];
		int b[] = new int[s];
		System.out.println("Enter first array element: ");
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second array element: ");
		for(int i=0;i<s;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Merged array is: "+Arrays.toString(isMerge(a, b)));;
	}
}
