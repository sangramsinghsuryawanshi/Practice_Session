package practices;

import java.util.Scanner;

public class PeakNumNotSmallerToItsNebhour 
{
	public void peakNum(int a[])
	{
		System.out.println("Peak element is: ");
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PeakNumNotSmallerToItsNebhour m = new PeakNumNotSmallerToItsNebhour();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.peakNum(a);
	}

}
