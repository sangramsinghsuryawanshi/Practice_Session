/*
 * 6. Zigzag Number and Star Pattern
	1 * 2 * 3
      * 2 * 3
          * 3

 */
package star.mix.pattern;

public class ZigzagNumberandStarPattern 
{
	public static void isZigzagNumberandStarPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int c=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{				
							
				if(j!=1)
				{
					System.out.print("* "+c+++" ");
				}
				else
				{
					System.out.print(c+++" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=3;
		isZigzagNumberandStarPattern(n);
	}

}
