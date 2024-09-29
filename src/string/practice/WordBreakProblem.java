/*
 * 18. Word Break Problem  
    Input: `"applepenapple", ["apple", "pen"]`  
    Output: `true`

 */
package string.practice;

public class WordBreakProblem 
{
	public static void isWBP(String str,String a,String p)
	{
		if(str.contains(a) && str.contains(p))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	public static void main(String[] args) 
	{
		String str="applepenapple";
		String a="apple";
		String p="pen";
		isWBP(str, a, p);
	}
}
