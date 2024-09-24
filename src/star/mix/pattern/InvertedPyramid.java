/*
 * 9. Inverted Pyramid (Stars in Middle)
 1 * 2 * 3 * 4 * 5
    * 2 * 3 * 4
      * 3 * 4
        * 4
         *

 */
package star.mix.pattern;

public class InvertedPyramid 
{
	public static void isInvertedPyramid(int n)
	{
		for(int i=1;i<=n+1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			int num=i;
			for(int j=i;j<n;j++)
			{
				if(j!=1)
				{
					System.out.print("* ");
				}
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isInvertedPyramid(n);
	}
}
