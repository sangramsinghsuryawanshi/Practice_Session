/*
 * Question: What is the output when finding the number of even elements in the array [5, 7, 8, 2, 9]?

Output: 2
 */
package array.practice.com;

public class FindEvenEle 
{
	public static int isEven(int a[])
	{
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				x++;
			}
		}
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5, 7, 8, 2, 9};
		System.out.println("count of even is: "+isEven(a));
	}

}
