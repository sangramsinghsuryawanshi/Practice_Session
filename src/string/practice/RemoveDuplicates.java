/*
 * 9. Remove Duplicates  
   Input: `"aabbcc"`  
   Output: `"abc"
 */
package string.practice;

public class RemoveDuplicates 
{
	public static void isRemoveDupli(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					j++;
				}
			}
		}
		System.out.println("Given Removed String is: "+sb);
	}
	public static void main(String[] args) 
	{
		String str="aabbcc";
		System.out.println("Given String is: "+str);
		isRemoveDupli(str);
	}
}
