/*
 * 5. Diamond Pattern with Stars and Numbers
  
     1
   1 * 2
  1 * 2 * 3
 1 * 2 * 3 * 4
1 * 2 * 3 * 4 * 5
 1 * 2 * 3 * 4
  1 * 2 * 3
   1 * 2
    1

 */
package star.mix.pattern;

public class DiamondPatternwithStarsandNumbers 
{
	public static void isDiamondPatternwithStarsandNumbers(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
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
		for(int i=1;i<n;i++)
		{
			for(int k=1;k<=i+1;k++)
			{
				System.out.print("  ");
			}
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
		isDiamondPatternwithStarsandNumbers(n);
	}

}
