/*
 * Q11.Wap enter a string and find the percentage of uppercase, 
 * lowercase, digits and special characters in a string.
 */
package string.practice;

import java.util.Scanner;

public class PercentageOUpperLowerAndMore 
{
	private int cntUp = 0, cntLo = 0, cntDi = 0, cntSp = 0, cnt = 0;
	double perUP, perLo = 0.0, perDi = 0.0, perSp = 0.0;
	public void isPer(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			cnt++;
			if(Character.isDigit(s.charAt(i)))
			{
				cntDi++;
			}
			else if(Character.isUpperCase(s.charAt(i)))
			{
				cntUp++;
			}
			else if(Character.isLowerCase(s.charAt(i)))
			{
				cntLo++;
			}
			else
			{
				cntSp++;
			}
		}
		 perUP=((double)cntUp/cnt)*100;
		 perLo=((double)cntLo/cnt)*100;
		 perDi=((double)cntDi/cnt)*100;
		 perSp=((double)cntSp/cnt)*100;
	}
	public double getPerUP() 
	{
		return perUP;
	}
	public double getPerLo() 
	{
		return perLo;
	}
	public double getPerDi() 
	{
		return perDi;
	}
	public double getPerSp() 
	{
		return perSp;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		PercentageOUpperLowerAndMore p = new PercentageOUpperLowerAndMore();
		p.isPer(givenString);
		System.out.print("\nPercentage of upper case: "+p.getPerUP());
		System.out.print("\nPercentage of lower case: "+p.getPerLo());
		System.out.print("\nPercentage of digit: "+p.getPerDi());
		System.out.print("\nPercentage of special character: "+p.getPerSp());
	}
}