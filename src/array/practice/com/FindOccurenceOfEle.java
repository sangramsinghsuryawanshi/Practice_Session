/*
 * Question: What is the output when counting the occurrences of each element in the array [1, 2, 2, 3, 3, 3]?

Output: {1=1, 2=2, 3=3}
 */
package array.practice.com;

public class FindOccurenceOfEle 
{
	public static void Ocuu(int a[])
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				System.out.print(a[i]+"="+cnt+",");
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {1, 2, 2, 3, 3, 3};
		Ocuu(a);
	}

}
