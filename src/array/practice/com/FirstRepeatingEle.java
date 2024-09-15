/*
 * Question: What is the output of finding the first repeating element in the array [5, 2, 3, 5, 4, 2]?
 */
package array.practice.com;

public class FirstRepeatingEle 
{
	public static int isRepeat(int a[])
	{
		int repeat=0;
		int cnt=-1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					if(cnt==-1)
					{
						cnt=i;
						repeat=a[i];
					}
				}
			}
		}
		return repeat;
	}
	public static void main(String[] args)
	{
		int a[]= {5, 2, 3, 5, 4, 2};
		System.out.println(isRepeat(a));

	}

}
