/*
 * 
14. Star and Number Rectangle
1 * 2 * 3
4 * 5 * 6
7 * 8 * 9

 */
package star.mix.pattern;

public class StarNum 
{
	public static void isStarNum(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(c+++" ");
				if(j<n)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=3;
		isStarNum(n);
	}
}
