package hollow.pattern.com;

import java.util.Scanner;

public class IllusionRectangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n number: ");
		int n = sc.nextInt();
		int a=65,as=66,asc=67,ascii=68;
		System.out.println("---------------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
					System.out.print("| ");
				
				
			}
			System.out.println();
		}
	}
}
