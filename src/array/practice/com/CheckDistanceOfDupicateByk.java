/*
 * 13. Check If Array Contains Duplicate Within K Distance
    - Input: `[1, 2, 3, 1, 2, 3]`, `K = 2`
    - Output: `true`
 */
package array.practice.com;

public class CheckDistanceOfDupicateByk
{
	public static void isDist(int a[],int k)
	{
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			int cn=0;
			for(int j=i+1;j<a.length;j++)
			{
				cnt++;
				if(a[i]==a[j])
				{
					cn++;
					break;
				}
			}
			if(cn!=0)
			{
				if(cnt-1==k)
				{
					System.out.println("true");
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 1, 2, 3};
		int k=2;
		isDist(a, k);
	}
}
