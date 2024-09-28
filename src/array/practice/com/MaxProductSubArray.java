/*
 * 8. Find the Maximum Product Subarray
   - Input: `[2, 3, -2, 4]`
   - Output: `6`

 */
package array.practice.com;

public class MaxProductSubArray 
{
	public static void isMPS(int a[])
	{
		Integer max=Integer.MIN_VALUE;
		String str="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				String s="";
				int p=1;
				for(int l=i;l<=j;l++)
				{
					s+=a[l]+" ";
					p*=a[l];
				}
				if(p>max)
				{
					max=p;
					str=s;
				}
			}
		}
		System.out.println(max+"::"+str);
	}
	public static void main(String[] args) 
	{
		int a[]= {2, 3, -2, 4};
		isMPS(a);
	}
}
