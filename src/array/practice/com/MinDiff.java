package array.practice.com;

public class MinDiff 
{
	public static String isMinDiff(int a[])
	{
		int min=Integer.MAX_VALUE;
		int sMin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				sMin=min;
				min=a[i];
			}
			else if(a[i]<sMin)
			{
				sMin=a[i];
			}
		}
		return min+"*"+sMin+" = "+(min-sMin);
	}
	public static void main(String[] args) 
	{
		int n[]= {3, 1, 4, 1, 5, 9};
		System.out.println(isMinDiff(n));
	}
}
