/*
 * 10.Wap to show an example of method overloading and method
 *  overriding. using string.
 */
package string.practice;

import java.util.Scanner;
class OverridingMethod
{
	public void isString(Scanner sc)
	{
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		System.out.println("Given string(Parent class)is: "+givenString);
	}
}
class OverloadingMethod extends OverridingMethod
{
	public void isString(Scanner sc)
	{
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		System.out.println("Given string(Method overriding) is: "+givenString);
		super.isString(sc);
	}
	public void isStringValid(Scanner sc)
	{
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		System.out.println("Given string(Method overloading)is: "+givenString);
	}
	public void isStringValid(String s,Scanner sc)
	{
		System.out.println("Enter given String: ");
		String givenString = sc.nextLine();
		System.out.println("Given string(Method overloading)is: "+givenString);
	}
}
public class MethodOveridingOverloadingQ10 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		OverloadingMethod o = new OverloadingMethod();
		o.isString(sc);
		o.isStringValid(sc);
		o.isStringValid("HI", sc);
	}

}
