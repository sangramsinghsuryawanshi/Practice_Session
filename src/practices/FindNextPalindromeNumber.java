package practices;

public class FindNextPalindromeNumber 
{
	public static boolean isPal(int a)
	{
		int rem=0,rev=0;
		for(int i=a;i!=0;i=i/10)
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		return rev==a;
	}
	public static void main(String[] args) 
	{
		int a=131;
		int nextpal=0;
		for(int i=a+1;;i++)
		{
			if(isPal(i))
			{
				nextpal=i;
				break;
			}
		}
		System.out.println("Next Palindrome is: "+nextpal);
	}

}
