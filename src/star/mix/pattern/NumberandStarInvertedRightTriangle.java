/*
 * 11. Number and Star Inverted Right Triangle
1 * 2 * 3 * 4 * 5
1 * 2 * 3 * 4
1 * 2 * 3
1 * 2
1

 */
package star.mix.pattern;

public class NumberandStarInvertedRightTriangle 
{
	public static void isNumberandStarInvertedRightTriangle(int n)
	{
		for(int i=0;i<=n+1;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(j+" ");
				if(j<n-i)
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
		isNumberandStarInvertedRightTriangle(n);
	}
}
