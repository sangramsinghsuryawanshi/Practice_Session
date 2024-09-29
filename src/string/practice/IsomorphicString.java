/*
 * 28. Isomorphic Strings  
    Input: `"egg", "add"`  
    Output: `true`

 */
package string.practice;

import java.util.ArrayList;
import java.util.List;

public class IsomorphicString 
{
	public static boolean isCS(String s,String s1)
	{
		List<Integer> l1 = new ArrayList<>();
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0')
			{
				l1.add(cnt);
			}
			
		}
		System.out.println(l1);
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<ch1.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<ch1.length;j++)
			{
				if(ch1[i]==ch1[j])
				{
					cnt++;
					ch1[j]='0';
				}
			}
			if(ch1[i]!='0')
			{
				l.add(cnt);
			}
		}
		System.out.println(l);
		return l.equals(l1);
	}
	public static void main(String[] args) 
	{
		String s="foo";
		String s1="bar";
		if(isCS(s,s1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
