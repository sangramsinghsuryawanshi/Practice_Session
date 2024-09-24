/*
* 
1 * 2 *
* 2 * 3
1 * 2 *
* 2 * 3

 */
package star.mix.pattern;

public class CheckerboardwithNumbersandStars 
{
	public static void isCheckerboardwithNumbersandStars(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				int c=1;
				for(int j=1;j<=n;j++)
				{
					if(j%2!=0)
					{
						System.out.print(c+++" ");
					}
					else
					{
						System.out.print("* ");
					}
				}
			}
			else
			{
				int c=2;
				for(int j=1;j<=n;j++)
				{
					if(j%2==0)
					{
						System.out.print(c+++" ");
					}
					else 
					{
						System.out.print("* ");
					}
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=4;
		isCheckerboardwithNumbersandStars(n);
	}

}