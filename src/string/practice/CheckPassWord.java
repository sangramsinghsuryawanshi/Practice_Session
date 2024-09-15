/*
 * Q2.Write a Java method to check whether a string is a valid password.

Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Expected Output:

1. A password must have at least eight characters.                                             
2. A password consists of only letters and digits.                                         
3. A password must contain at least two digits    

 */
package string.practice;

public class CheckPassWord 
{
	public static void isValidate(String str)
    {
        if (str.length() < 10) 
        {
            System.out.println("Password must have at least 10 characters.");
        }

        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) 
            {
                digitCount++;
            } 
            else if (!Character.isLetter(ch)) 
            {
                System.out.println("Password must consist of only letters and digits.");
                break;
            }
        }

        if (digitCount < 2)
        {
            System.out.println("Password must contain at least two digits.");
        }

        System.out.println("Password is valid.");
    }

    public static void main(String[] args) 
    {
        String str = "sangram123"; 
        isValidate(str);
        
        String str1 = "sangram1!@";
        isValidate(str1);
        
        String str2 = "sangram!@"; 
        isValidate(str2);
        
        String str3 = "sangram12";
        isValidate(str3);
    }
}
