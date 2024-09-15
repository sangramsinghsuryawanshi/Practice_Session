package practices;

import java.util.Scanner;

public class NTowrs 
{
	public void towerN(int a[])
	{
		int sum=0,k=6;
		int dsum=0,ind=0;
		for(int i=1;i<a.length;i++)
		{
			if(i<=0)
			{
				sum=a[i]+k;
				ind++;
			}
			else
			{
				sum=a[i]-k;
				ind++;
			}
	
		}
		System.out.println("Maximum diffrence is: "+(sum+1));
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NTowrs m = new NTowrs();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.towerN(a);
	}

}
