package string.practice;

public class RemoveDupicates 
{
	public static int isDel(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		int cnt=0;
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					j--;
					cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) 
	{
		String str="xyyyz";
		System.out.println(isDel(str));
	}
}
