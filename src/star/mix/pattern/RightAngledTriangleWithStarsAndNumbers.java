/*
 * 2. Right-Angled Triangle with Stars and Numbers
1
2 *
3 * 3
4 * 4 *
5 * 5 * 5

 */
package star.mix.pattern;

public class RightAngledTriangleWithStarsAndNumbers 
{
	public static void isRightAn(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{				
				if(j%2!=0)
				{
					System.out.print(c+" ");
				}
				else
				{
					if(j<=i)
					{
						System.out.print("* ");
					}
				}
			}
			c++;
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isRightAn(n);
	}

}
