/*
 * 12. Mixed Triangle with Stars and Numbers
1 * 2 * 3
1 * * 2
1 * * * 

 */
package star.mix.pattern;

public class MixedTraingle 
{
	public static void isMixedTriangle(int n)
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1)
				{
					System.out.print("1 ");
				}
				else if(i==1 && j==3) 
				{
					System.out.print("2 ");
				}
				else if(i==1 && j==5) 
				{
					System.out.print("3 ");
				}
				else if(i==2 && j==4)
				{
					System.out.print("2 ");
				}
				else if(i==2 && j==5)
				{
					continue;
				}
				else if(i==3 && j==4)
				{
					continue;
				}
				else
				{
					System.out.print("* ");	
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=6;
		isMixedTriangle(n);
	}
}
