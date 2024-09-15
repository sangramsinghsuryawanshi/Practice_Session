package practices;

import java.util.Scanner;

public class AutomorrphiSeries 
{
	AutomorrphiSeries(int n,int n1)
	{
		for(int i=n;i<=n1;i++)
		{
			int c=0,sq=i*i;
			int lastdigit=0;
			for(int j=i;j!=0;j=j/10)
			{
				c++;
			}
			lastdigit=(int)(sq%(Math.pow(10, c)));
			if(lastdigit==i)
			{
				System.out.println(lastdigit);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int n= sc.nextInt();
		int n1= sc.nextInt();
		AutomorrphiSeries a = new AutomorrphiSeries(n,n1);
		
	}

}
