package practices;

public class CountOfVowels 
{
	public static int isCntVowel(String str)
	{
		char ch[]=str.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) 
	{
		String str = "programming";
		System.out.println("Count of Vowel is: "+isCntVowel(str));
	}

}
