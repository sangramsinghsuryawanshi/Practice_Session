/*
 * 15. Roman to Integer  
    Input: `"IX"`  
    Output: `9`
 */
package string.practice;

import java.util.HashMap;

public class RomanToInteger 
{
	 public static int romanToInt(String s) 
	 {
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);
	        int ind=0;
	        for(int i=0;i<s.length();i++)
	        {
	        	int newInd=romanMap.get(s.charAt(i));
	        	
	        	if((i+1)< s.length() && romanMap.get(s.charAt(i+1))>newInd)
	        	{
	        		ind-=newInd;
	        	}
	        	else
	        	{
	        		ind+=newInd;
	        		System.out.println(ind);
	        		System.out.println(newInd);
	        	}
	        }
	        return ind;
	 }
	public static void main(String[] args) 
	{
		String romanNumeral = "IX";
        int result = romanToInt(romanNumeral);
        System.out.println("Roman numeral: " + romanNumeral + ", Integer value: " + result); // Output: 9
    
	}
}
