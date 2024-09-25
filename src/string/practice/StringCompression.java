/*
 * 5. String Compression  
   Input: `"aaabbccc"`  
   Output: `"a3b2c3"`
 */
package string.practice;

public class StringCompression 
{
	public static void isComp(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
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
				System.out.print(ch[i]+""+cnt);
			}
		}
	}
	public static void main(String[] args) 
	{
		String str="aaabbccc";
		System.out.println("Given String is: "+str);
		isComp(str);
	}
}
