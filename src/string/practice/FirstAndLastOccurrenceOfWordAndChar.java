package string.practice;

import java.util.Scanner;

public class FirstAndLastOccurrenceOfWordAndChar 
{
	public static String occurenceOfWord(String str)
	{
		String [] sp=str.split(" ");
		String word=null,lWord=null;;
		int x=-1;
		for(int i=0;i<sp.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<sp.length;j++)
			{
				if(sp[i].equals(sp[j]))
				{
					cnt++;
					if(x==-1)
					{
						x++;
						word=sp[i];
					}
					sp[j]="0";
				}
				if(cnt>1 && sp[i]!="0")
				{
					lWord=sp[i];
				}
			}
		}
		return word+" "+lWord;
	}
	public static String occurenceOfChar(String str)
	{
		char ch[]=str.toCharArray();
		int x=-1;
		char cFirst='\0',cLast='\0';
		for(int i=0;i<ch.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					if(x==-1)
					{
						x=i;
						cFirst=ch[i];
					}
					ch[j]='\0';
				}
			}
			if(cnt>1 && ch[i]!='\0')
			{
				cLast=ch[i];
			}
		}
		return cFirst+" "+cLast;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter given string: ");
		String str = sc.nextLine();
		System.out.println("---------------------------------");
		FirstAndLastOccurrenceOfWordAndChar f = new FirstAndLastOccurrenceOfWordAndChar();
		System.out.println("First and last occurrence of word is: "+occurenceOfWord(str));
		System.out.println("First and last occurrence of character is: "+occurenceOfChar(str));
	}

}
