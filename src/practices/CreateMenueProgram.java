package practices;

import java.util.Scanner;

public class CreateMenueProgram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice\r\n1.check palindrom number \r\n"
				+ "2. check prime number \r\n"
				+ "3. check armstrong number \r\n"
				+ "4. get the palindrom series between the range \r\n"
				+ "5. get the prime series between the range \r\n"
				+ "6. get the armstrong series between the range.\r\n"
				+ "7. get the fabannoci sequence\r\n"
				+ "8. press zero(0) to exit");
		int ch=-1;
		while(ch!=0)
		{
			ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter n number: ");
			int n=sc.nextInt();
			int rem=0,rev=0;
			for(int i=n;i!=0;i=i/10)
			{
				rem=i%10;
				rev=(rev*10)+rem;
			}
			if(rev==n)
			{
				System.out.println("Given number is palindrome");
			}
			else
			{
				System.out.println("Given number is not palindrome");
			}
			break;
		case 2:
			System.out.println("Enter n number: ");
			int n1=sc.nextInt();
			int c=0;
			for(int i=1;i<=n1;i++)
			{
				if(n1%i==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Given number is prime");
			}
			else
			{
				System.out.println("Given number is not prime");
			}
			break;
		case 3:
			System.out.println("Enter n number: ");
			int first=sc.nextInt();
			int rem1=0,rev1=0;
			for(int i=first;i!=0;i=i/10)
			{
				rem1=i%10;
				rev1+=(rem1*rem1*rem1);
			}
			if(rev1==first)
			{
				System.out.println("Given number is Armstrong");
			}
			else
			{
				System.out.println("Given number is not Armstrong");
			}
			break;
		case 4:
			System.out.println("Enter two number: ");
			int first1=sc.nextInt();
			int second=sc.nextInt();
			System.out.println("Palindrome number is: ");
			for(int j=first1;j<=second;j++)
			{
				int rem2=0,rev2=0;
				for(int i=j;i!=0;i=i/10)
				{
					rem2=i%10;
					rev2=(rev2*10)+rem2;
				}
				if(rev2==j)
				{
					System.out.println(rev2);
				}
			}
			break;
		case 5:
			System.out.println("Enter two number: ");
			int first3=sc.nextInt();
			int second3=sc.nextInt();
			System.out.println("prime number is: ");
			for(int j=first3;j<=second3;j++)
			{
				int c1=0;
				for(int i=1;i<=j;i++)
				{
					if(j%i==0)
					{
						c1++;
					}
				}
				if(c1==2)
				{
					System.out.println(j);
				}
			}
			break;
		case 6:
			System.out.println("Enter two number: ");
			int first4=sc.nextInt();
			int second4=sc.nextInt();
			System.out.println("Armstrong number is: ");
			for(int j=first4;j<=second4;j++)
			{
				int rem2=0,rev2=0;
				for(int i=j;i!=0;i=i/10)
				{
					rem2=i%10;
					rev2+=(rem2*rem2*rem2);
				}
				if(rev2==j)
				{
					System.out.println(rev2);
				}
			}
			break;
		case 7:
			System.out.println("Enter range: ");
			int a=sc.nextInt();
			System.out.println("Fibonacii series is: ");
			int a1=0,b1=1,sum=0;
			for(int j=1;j<=a;j++)
			{
				System.out.println(a1);
				sum=a1+b1;
				a1=b1;
				b1=sum;
			}
			break;
		case 8:
			System.out.println("Exited...");
			ch=0;
			break;
		}
		}

	}

}
