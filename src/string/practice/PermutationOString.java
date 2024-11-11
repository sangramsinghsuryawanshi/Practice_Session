package string.practice;

public class PermutationOString 
{
	public static void isPermutation(String str,String result)
	{
		if(str.length()==0)
		{
			System.out.print(result+" ");
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String newString=str.substring(0, i)+str.substring(i+1);
			isPermutation(newString, result+ch);
		}
	}
	public static void main(String[] args) 
	{
		String str="ABC";
		System.out.println("Given String Combination is: ");
		isPermutation(str,"");
	}
}
