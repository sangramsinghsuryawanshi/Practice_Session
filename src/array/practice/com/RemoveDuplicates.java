/*
 * Question: What is the output when removing duplicates from the array [4, 2, 7, 2, 4, 7]?

Output: [4, 2, 7]
 */
package array.practice.com;

public class RemoveDuplicates 
{
	public static int[] removeDuplicate(int a[])
	{
		int b[] = new int[a.length];
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
			if(a[i]!=0)
			{
				b[x++]=a[i];
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		int a[]= {4, 2, 7, 2, 4, 7};
		for(int i=0;i<removeDuplicate(a).length;i++)
		{
			if(removeDuplicate(a)[i]!=0)
			{
				System.out.print(removeDuplicate(a)[i]+" ");
			}
		}

	}

}
