/*
*****
*   *
*   *
*   *
*****
 */
package hollow.pattern.com;

public class HollowSquarePattern 
{
	public static void isSq(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n)
				{
					System.out.print("*");
				}
				else if(j==1 || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isSq(n);
	}
}
