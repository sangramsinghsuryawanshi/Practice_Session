/*
 * 23. Find All Elements Appearing More Than N/3 Times
    - Input: `[3, 2, 3, 2, 2]`
    - Output: `[2]`

 */
package array.practice.com;

public class ElementApperaingMoreThanThreeTimes 
{
	public static void isApper(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=0;
				}
			}
			if(cnt>a.length/3 && a[i]!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {3, 2, 3, 2, 2};
		isApper(a);
	}
}