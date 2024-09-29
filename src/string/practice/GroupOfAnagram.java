/*
 * 22. Group Anagrams  
    Input: `["eat", "tea", "tan", "ate", "nat", "bat"]`  
    Output: `[["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]`
 */
package string.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupOfAnagram 
{
	public static void isGOA(String s)
	{
		String s1[]=s.split(" ");
		List<List<String>> ls = new ArrayList<>();
		boolean b[]=new boolean[s1.length];
		for(int i=0;i<s1.length;i++)
		{
			if(b[i])continue;
			List<String> anagramGroup = new ArrayList<>();
			anagramGroup.add(s1[i]);
			for(int j=i+1;j<s1.length;j++)
			{
				if(isAn(s1[i], s1[j]))
				{
					anagramGroup.add(s1[j]);
					b[j]=true;
				}
			}
			ls.add(anagramGroup);
		}
		System.out.println(ls);
	}
	public static boolean isAn(String s,String s1)
	{
		 char[] arr1 = s1.toCharArray();
	        char[] arr2 = s.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        return Arrays.equals(arr1, arr2);
	}
	public static void main(String[] args) 
	{
		String s="eat tea tan ate nat bat aet ant tae";
		isGOA(s);
	}
}
