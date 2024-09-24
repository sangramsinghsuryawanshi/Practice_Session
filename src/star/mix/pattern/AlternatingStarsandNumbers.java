/*
 * 1. Alternating Stars and Numbers

1 * 2 * 3 * 4 * 5
1 * 2 * 3 * 4
1 * 2 * 3
1 * 2
1

 */
package star.mix.pattern;

public class AlternatingStarsandNumbers 
{
	public static void isAlt(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			c=1;
			for(int j=n;j>=i;j--)
			{
				System.out.print(c+++" ");
				if(j>i)
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
		isAlt(n);
	}

}
