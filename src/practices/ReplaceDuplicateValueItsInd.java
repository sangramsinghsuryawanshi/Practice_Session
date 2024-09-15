package practices;

import java.util.Scanner;

public class ReplaceDuplicateValueItsInd 
{

	public void repaceIndDuplicate(int a[],int x)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				System.out.println("first occurence index of repeating element is: "+i);
				break;
			}
		}
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]==x)
			{
				System.out.println("last occurence index of repeating element is: "+i);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReplaceDuplicateValueItsInd m = new ReplaceDuplicateValueItsInd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("Enter x value: ");
		int x = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.repaceIndDuplicate(a,x);
	}

}


