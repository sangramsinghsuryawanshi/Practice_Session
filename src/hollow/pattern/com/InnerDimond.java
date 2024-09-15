package hollow.pattern.com;

import java.util.Scanner;

public class InnerDimond 
{

	public static void isInnerDimond(int n)
	{
		int ascii = 65;
		int ascii1=72;
        for(int i=1;i<=n;i++)
        {
            for(int k=n;k>=i;k--)
            {
            	System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
            	if(j==1)
            	{
            		System.out.print((char)ascii+"");
            	}
            	else if(j==i || i==n || j==n/2)
            	{
            		System.out.print("*");
            	}
            	else
            	{
            		System.out.print(" ");
            	}
            }
            for(int j=2;j<=i;j++)
            {
            	if(i==j)
            	{
            		System.out.print((char)ascii+"");
            	}
            	else if(i==n)
            	{
            		System.out.print("*");
            	}
            	else if(j==i-n/2+1)
            	{
            		System.out.print("*");
            	}
            	else
            	{
            		System.out.print(" ");
            	}
            }
            ascii++;
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
            	System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
            	if(j==n)
            	{
            		System.out.print((char)ascii1+"");
            	}
            	else if(j==i || j==n/2+2)
            	{
            		System.out.print("*");
            	}
            	else
            	{
            		System.out.print(" ");
            	}
            }
            for(int j=n-1;j>=i;j--)
            {
            	if(j==i)
            	{
            		System.out.print((char)ascii1+"");
            	}
            	else if(i==j-n/2+1)
            	{
            		System.out.print("*");
            	}
            	else
            	{
            		System.out.print(" ");
            	}
            }
            ascii++;
            ascii1++;
            System.out.println();
        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N number: ");
		int n = sc.nextInt();
		System.out.println("------------------------");
		InnerDimond.isInnerDimond(n);
	}

}
