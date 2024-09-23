/*
 * 
16. Find All Pairs with a Given Sum
    - Input: `[1, 2, 3, 4, 3, 5]`, `Sum = 6`
    - Output: `[(1, 5), (2, 4), (3, 3)]`
 */
package array.practice.com;

public class FindAllPairsWithSum 
{
	public static void isSum(int a[],int sum)
	{
		System.out.print("[");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.print("("+a[i]+","+a[j]+")");
				}
			}
		}
		System.out.print("]");
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 3, 4, 3, 5};
		int Sum = 6;
		isSum(a,Sum);
	}
}
