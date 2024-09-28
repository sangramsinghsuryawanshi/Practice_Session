///*
// * 16. Find the Longest Common Subarray Between Two Arrays
//    - Input: `[1, 2, 3, 2, 1]` and `[3, 2, 1, 4, 7]`
//    - Output: `[3, 2, 1]`
//
// */
//package array.practice.com;
//
//public class LongCommonArrayBetwwenTwoArray 
//{
//	public static void idMLC(int a[],int b[])
//	{
//		int max=0;
//		StringBuffer sb = new StringBuffer();
//		StringBuffer sb1 = new StringBuffer();
//		for(int i=0;i<a.length;i++)
//		{
//			int cnt=0;
//			String s="";
//			String s1="";
//			for(int j=i;j<a.length;j++)
//			{
//				for(int k=i;k<=j;k++)
//				{
//					if(b[k]==a[k])
//					{
//						System.out.print(a[k]+" ");
//					}
//					
//				}
//				System.out.println();
//			}
//		}
//		System.out.println(max);
//	}
//	public static void main(String[] args) 
//	{
//		int a[]= {1, 2, 3, 2, 1};
//		int b[]= {3, 2, 1, 4, 7};
//		idMLC(a,b);
//	}
//}
