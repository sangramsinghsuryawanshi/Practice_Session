/*
 * 3. WAP to reverse each even digit and leave odd digits
 *  unchanged in the inputted number
   Input: 1234

   Output: 1432 (2 and 4 are reversed in their positions)

 */
package practices;
import java.util.Scanner;

public class ChangeEvenPosition 
{
	public static int[] isChange(int a[])
	{
		
		int evenCount=0;
		for(int i=0;i< a.length;i++) 
		{
            if(a[i]%2==0) 
            {
                evenCount++;
            }
        }
		int b[]=new int[evenCount];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[x++]=a[i];
			}
		}
        for(int i=0;i<b.length/2;i++) 
        {
            int temp= b[i];
            b[i] = b[b.length-1-i];
            b[b.length-1-i] = temp;
        }
        x=0;
        for (int i=0;i<a.length;i++) 
        {
            if (a[i]%2==0) 
            {
                a[i]=b[x++];
            }
        }
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n-----------------------");
		int b[]=isChange(a);
		System.out.print("\nGiven element is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"");
		}
	}

}
