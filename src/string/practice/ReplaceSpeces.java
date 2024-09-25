/*
 * 14. Replace Spaces with %20  
    Input: `"Mr John Smith"`  
    Output: `"Mr%20John%20Smith"`
 */
package string.practice;

public class ReplaceSpeces 
{
	public static void isReplace(String s)
	{
		s=s.replace(" ", "%20");
		System.out.println("Replace String is: "+s);
	}
	public static void main(String[] args) 
	{
		String str="Mr John Smith";
		System.out.println("Given String is: "+str);
		isReplace(str);
	}
}
