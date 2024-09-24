/*
 * 2. Find the Longest Consecutive Sequence
   - Input: `[100, 4, 200, 1, 3, 2]`
   - Output: `4` (Sequence `[1, 2, 3, 4]`)

 */
package array.practice.com;

import java.util.Arrays;

public class LongestConsicutiveSequence 
{
	public static void isLongest(int a[])
	{
		Arrays.sort(a);
		int max=0;
		String d="";
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int num=0;
				String str="";
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
					max=str.length();
					d=str;
				}
			}
		}
		System.out.println(d+" "+max);
	}
	public static void main(String[] args) 
	{
		int a[]= {100, 4, 200, 1, 3, 2};
		isLongest(a);
	}
}
