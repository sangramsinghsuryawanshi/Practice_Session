/*
 * 3. Find All Subsequences  
   Input: `"abc"`  
   Output: `["", "a", "b", "c", "ab", "ac", "bc", "abc"]`

 */
package string.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllSubsequences 
{
	public static void isAS(String str,String sub,List<String> ls)
	{
		if(str.isEmpty())
		{
			ls.add(sub);
			return;
		}
		isAS(str.substring(1), sub, ls);
		isAS(str.substring(1), sub+str.charAt(0), ls);
	}
	public static List<String> isLi(String str)
	{
		List<String> ls = new ArrayList<>();
		isAS(str,"", ls);
		return ls;
	}
	public static void main(String[] args) 
	{
		String str="abc";
		List<String> ls = isLi(str);
		Collections.sort(ls,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return Integer.compare(o1.length(), o2.length());
			}
		});
		System.out.println(ls);
	}
}
