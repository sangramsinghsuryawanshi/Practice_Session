/*
 * 7. Increasing Numbers with Stars Pyramid
    1
   1 * 2
  1 * 2 * 3
 1 * 2 * 3 * 4
1 * 2 * 3 * 4 * 5

 */
package star.mix.pattern;

public class IncreasingNumberswithStarsPyramid 
{
	public static void isIncreasingNumberswithStarsPyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{				
				System.out.print(j+" ");				
				if(j<i)
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
		isIncreasingNumberswithStarsPyramid(n);
	}

}