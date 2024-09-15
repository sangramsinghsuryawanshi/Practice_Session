/*
 * 8.Wap enter a string and the character present at even and odd position individually.
 */
package string.practice;
import java.util.Scanner;
public class CharacterPresentAtEvenAndOdd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		char ch[]=givenString.toCharArray();
		System.out.print("\nEven character: ");
		for(int i=0;i<ch.length;i++)
		{
			if((i+1)%2==0)
			{
				if(ch[i]!=' ')
				{
					System.out.print(ch[i]);
				}
			}
		}
		System.out.print("\nOdd character: ");
		for(int i=0;i<ch.length;i++)
		{
			if((i+1)%2!=0)
			{
				if(ch[i]!=' ')
				{
					System.out.print(ch[i]);
				}
			}
		}
	}
}
