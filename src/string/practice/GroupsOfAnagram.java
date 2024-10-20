package string.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupsOfAnagram 
{
	public static void isGOA(String s)
	{
		String s1[]=s.split(" ");
		List<List<String>> ls = new ArrayList<>();
		boolean b[]=new boolean[s.length()];
		for(int i=0;i<s1.length;i++)
		{
			if(b[i])continue;
			List<String> l = new ArrayList<>();
			l.add(s1[i]);
			for(int j=i+1;j<s1.length;j++)
			{
				if(isValid(s1[i], s1[j]))
				{
					l.add(s1[j]);
					b[j]=true;
				}
			}
			ls.add(l);
		}
		System.out.println(ls);
	}
	public static boolean isValid(String s,String s1)
	{
		char[] c=s.toCharArray();
		char[] c1=s1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		return Arrays.equals(c, c1);
	}
	public static void main(String[] args) 
	{
		String s="eat tea tan ate nat bat aet ant tae";
		isGOA(s);
	}
}
