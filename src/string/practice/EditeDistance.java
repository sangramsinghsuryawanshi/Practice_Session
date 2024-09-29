/*
 * Edit Distance  
    Input: `"horse", "ros"`  
    Output: `3`

 */
package string.practice;

import java.util.Arrays;

public class EditeDistance 
{
	public static void isWBP(String str,String a)
	{
		int cnt=0;
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		char ch1[]=a.toCharArray();
		Arrays.sort(ch1);
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		System.out.println(cnt);
	}
	public static void main(String[] args) 
	{
		String str="horse";
		String a="hrosh";
		isWBP(str, a);
	}
}
