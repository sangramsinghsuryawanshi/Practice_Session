/*
 * 13. Hollow Number-Star Pyramid
1
1 * 2
1     2 * 3
1         2 * 3 * 4
1 * 2 * 3 * 4 * 5

 */
package star.mix.pattern;

public class HollowStarMixPyramid 
{
	public static void isHollowStarMixPyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				if(i==3 && j==1)
				{
					System.out.print("   ");
				}
				else if(i==4 && j==1)
				{
					System.out.print("        ");
				}
				else if(j<i)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isHollowStarMixPyramid(n);
	}
}
