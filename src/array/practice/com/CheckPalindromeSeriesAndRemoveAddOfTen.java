/*
 * 6. WAP to print the palindrom series between 100 to 500 and store
 *  into an array now remove all the element from array who's sum of the number above 10.
 */
package array.practice.com;

import java.util.Scanner;

public class CheckPalindromeSeriesAndRemoveAddOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input series of prime number: ");
		int n =sc.nextInt();
		int n1 = sc.nextInt();
	
		int c=0;
		for(int i=n;i<=n1;i++)
		{
			int rem=0,rev=0;
			for(int temp=i;temp!=0;temp=temp/10)
			{
				rem=temp%10;
				rev=(rev*10)+rem;
			}
			if(rev==i)
			{
				c++;
			}
		}
		int a[]=new int[c];
		int x=0;
		for(int i=n;i<=n1;i++)
		{
			int rem=0,rev=0;
			for(int temp=i;temp!=0;temp=temp/10)
			{
				rem=temp%10;
				rev=(rev*10)+rem;
			}
			if(rev==i)
			{
				a[x++]=rev;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			int rem=0,sum=0;
			for(int temp=a[i];temp!=0;temp=temp/10)
			{
				rem=temp%10;
				sum+=rem;
			}
			if(sum<10)
			{
				System.out.println(a[i]);
			}
		}
	}

}
