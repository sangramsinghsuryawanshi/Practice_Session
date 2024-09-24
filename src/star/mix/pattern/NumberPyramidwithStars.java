/*
 * 3. Number Pyramid with Stars
1
1 * 2
1 * 2 * 3
1 * 2 * 3 * 4
1 * 2 * 3 * 4 * 5

 */
package star.mix.pattern;

public class NumberPyramidwithStars 
{
	public static void isPyramidwithStars(int n)
	{
		for(int i=1;i<=n;i++)
		{
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
		isPyramidwithStars(n);
	}

}
