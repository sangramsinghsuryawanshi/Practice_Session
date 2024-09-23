package array.practice.com;

public class MinimumLengthSubArray 
{
	public static void isSumK(int a[],int l)
	{
		int temp=Integer.MAX_VALUE;
		String s="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				String str="";
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					str+=a[k]+" ";
				}
				if(sum==l && str.length()<temp)
				{
					temp=str.length();
					s=str;
				}
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 3, 1, 2, 4, 3};
		int k=7;
		isSumK(a, k);
	}
}
