/*
 * 8. Cross Pattern with Stars and Numbers

1   *
 2 *
  3
 * 4
*   5

 */
package star.mix.pattern;

public class CrossPatternwithStarsandNumbers 
{
	public static void isCrossPatternwithStarsandNumbers(int n)
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{				
							
				if(i==j)
				{
					System.out.print(c+"");
				}
				else if((i+j)==n+1)
				{
					System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			c++;
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		isCrossPatternwithStarsandNumbers(n);
	}

}