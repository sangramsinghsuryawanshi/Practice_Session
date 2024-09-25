/*
 * 7. First Non-Repeated Character  
   Input: `"swiss"`  
   Output: `"w"
 */
package string.practice;

public class FirstNonRepeatedChar 
{
	public static char isNonRe(String str)
	{
		int x=0;
		char ch1='0';
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
				}
			}
			if(cnt==1 && x==0)
			{
				ch1=ch[i];
				x++;
			}
		}
		return ch1;
	}
	public static void main(String[] args) 
	{
		String str="swiss";
		System.out.println("Given String is: "+str);
		System.out.println("Given First Non-Repeated Character is: "+isNonRe(str));
	}
}
