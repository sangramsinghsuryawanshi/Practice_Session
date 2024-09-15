/*
 * Input: n = 5
Output:
ABCDE
   D
  C
 B
ABCDE

 */
package abcdPattern.com;

public class ZPattern 
{
	public static void Z()
	{
		int n=5;
		int ascii=65;
		for(int i=1;i<=n;i++)
		{
			ascii=64;
			for(int j=1;j<=n;j++)
			{
				ascii++;
				if(i==1 || i==n)
				{
					System.out.print((char)ascii+" ");
				}
				else if(j==n-i+1)
				{
					System.out.print((char)ascii+" ");
					
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Z();
	}
}
