package practices;

import java.util.Scanner;

public class MoveNegeToFirstArr 
{
	public void negativeMove(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>0)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Negative number moved to frist: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MoveNegeToFirstArr m = new MoveNegeToFirstArr();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.negativeMove(a);
	}
}
