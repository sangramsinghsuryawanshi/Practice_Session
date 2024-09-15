package practices;

import java.util.Arrays;

public class FibonaciSeries 
{
	public static int[] isFibonaci(int n)
	{
		int a[] = new int[n];
		int a1=0,b=1,sum=0,x=0;
		for(int i=1;i<=n;i++)
		{
			a[x++]=a1;
			sum=a1+b;
			a1=b;
			b=sum;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int n=10;
		System.out.println(Arrays.toString(isFibonaci(n)));
	}
}
