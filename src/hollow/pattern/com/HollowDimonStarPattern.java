/*
 * Input: n = 7
Output:
*******
**   **
* * * *
*  *  *
* * * *
**   **
*******

 */
package hollow.pattern.com;

public class HollowDimonStarPattern 
{
	public static void dimodStar()
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1 || j==n || i==j || n-i+1==j || j==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		dimodStar();
	}
}
