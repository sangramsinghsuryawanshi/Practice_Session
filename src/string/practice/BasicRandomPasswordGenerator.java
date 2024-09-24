package string.practice;

import java.util.Random;

public class BasicRandomPasswordGenerator 
{
    static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    
    public static String generatePassword(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) 
        {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }
        
        return password.toString();
    }

    public static void main(String[] args) 
    {
    	  int passwordLength = 8;  
          String password = generatePassword(passwordLength);
          
          System.out.println("Generated Random Password: " + password);

    }
}