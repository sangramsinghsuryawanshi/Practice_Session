package string.practice;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfString 
{
	public static void isSub(String str,String sub,List<String> ls)
	{
		if(str.isEmpty())
		{
			ls.add(sub);
			return;
		}
		isSub(str.substring(1), sub, ls);
		isSub(str.substring(1), sub+str.charAt(0), ls);
	}
	public static List<String> isLS(String s)
	{
		List<String> ls = new ArrayList<>();
		isSub(s, "", ls);
		return ls;
	}
	public static void main(String[] args) 
	{
		String s="ABC";
		System.out.println(isLS(s));
	}
}
