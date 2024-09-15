package practices;

import java.util.Scanner;

public class KthUnsortedArrayFind 
{

	public void kUnsorted(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kth element: ");
		int k = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Kth element is: ");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)==k)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		KthUnsortedArrayFind m = new KthUnsortedArrayFind();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.kUnsorted(a);
	}

}

