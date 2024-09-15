/*
 * Question: What is the output of calculating the product of all elements in the array [1, 2, 3, 4]?

Output: 24
 */
package array.practice.com;

public class ProductOfEle 
{
	public static int isProduct(int a[])
	{
		int pro=1;
		for(int i=0;i<a.length;i++)
		{
			pro*=a[i];
		}
		return pro;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 3, 4};
		System.out.println("Product is: "+isProduct(a));
	}

}
