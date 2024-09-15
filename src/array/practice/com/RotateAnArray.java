package array.practice.com;

import java.util.Arrays;

public class RotateAnArray 
{
	public static int[] isRotated(int a[])
	{
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(isRotated(a)));
	}

}
