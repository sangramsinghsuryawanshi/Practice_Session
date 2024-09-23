/*
 * 28. Find the Count of Subarrays with Product Less Than K
    - Input: `[10, 5, 2, 6]`, `K = 100`
    - Output: `7`

 */
package array.practice.com;

public class CountOfSubArray 
{
	public static void isLessPro(int a[],int k)
	{
		int cnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int t=1;
				String s="";
				for(int l=i;l<=j;l++)
				{
					t*=a[l];
					s+=a[l]+" ";
				}
				if(t<k)
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) 
	{
		int a[]= {10, 5, 2, 6};
		int k=100;
		isLessPro(a, k);
	}
}
