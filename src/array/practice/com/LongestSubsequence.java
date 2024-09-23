/*
 * 7. Find the Longest Increasing Subsequence
   - Input: `[10, 9, 2, 5, 3, 7, 101, 18]`
   - Output: `[2, 3, 7, 101]`
 */
package array.practice.com;

public class LongestSubsequence 
{
	public static void isLong(int a[])
	{
		String s="";
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				String str="";
				int num=0;
				for(int k=i;k<=j;k++)
				{
					if(num<=a[k])
					{
						str+=a[k]+" ";
						num=a[k];
					}
				}
				if(str.length()>max)
				{
					s=str;
					max=str.length();
				}
			}
		}
		System.out.println(s+" ");
	}
	public static void main(String[] args) 
	{
		int a[]= {10, 9, 2, 5, 3, 7, 101, 18};
		isLong(a);
	}
}
