/*
 * 27. Reverse Vowels  
    Input: `"hello"`  
    Output: `"holle"`

 */
package string.practice;

import java.util.Arrays;

public class ReverseVowels 
{
	public static void isRV(String s)
	{
		int cnt=0;
		char ch[]=s.toCharArray();
		char ch1[]=new char[s.length()];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				ch1[cnt++]=ch[i];
			}
		}
		cnt--;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				ch[i]=ch1[cnt--];
			}
		}
		System.out.println(Arrays.toString(ch));
	}
	public static void main(String[] args) 
	{
		String s="hello";
		isRV(s);
	}
}
