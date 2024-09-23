/*
 * 29. Find the First Repeating Element
    - Input: `[4, 5, 6, 7, 5, 4]`
    - Output: `5`

 */
package array.practice.com;

public class FirstReaptingEle 
{
	public static void isLessPro(int a[],int k)
	{
		int t=-1,c=0;
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
			if(cnt>0 && a[i]!=0 && c==0)
			{
				t=a[i];
				c++;
			}
		}
		System.out.println(t);
	}
	public static void main(String[] args) 
	{
		int a[]= {4, 5, 6, 7, 5, 4};
		int k=100;
		isLessPro(a, k);
	}
}
