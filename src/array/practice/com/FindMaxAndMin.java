package array.practice.com;

public class FindMaxAndMin 
{
	public static int isMax(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	public static int isMin(int a[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		System.out.println("Max: "+isMax(a));
		System.out.println("Min: "+isMin(a));
	}

}
