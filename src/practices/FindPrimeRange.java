package practices;

public class FindPrimeRange 
{
	public static int isPrimeSeries(int first,int last)
	{
		for(int i=first;i<=last;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i+" ");
			}
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		int first=10;
		int last =100;
		isPrimeSeries(first, last);
	}
}
