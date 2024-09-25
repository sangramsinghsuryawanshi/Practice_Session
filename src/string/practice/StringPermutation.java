/*
 * 6. String Permutation  
   Input: `"abc"`  
   Output: `["abc", "acb", "bac", "bca", "cab", "cba"]`
 */
package string.practice;

public class StringPermutation 
{
	public static void isPerm(String str,String per)
	{
		if(str.length()==0)
		{
			System.out.print(per+" ");
		}
		else
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				String newString=str.substring(0, i)+str.substring(i+1);
				isPerm(newString, per+ch);
			}
		}
	}
	public static void main(String[] args) 
	{
		String str="abc";
		System.out.println("Given String is: "+str);
		System.out.println("Given String Permutation is: ");
		isPerm(str, "");
	}
}
