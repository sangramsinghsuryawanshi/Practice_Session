/*
 * Q8.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples: 

Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80

 */
package array.practice.com;

import java.util.Scanner;

public class PrintCommonEle {

	public void printCommonArr(int a[],int b[],int c[]) 
	{
		System.out.print("Given common array element is: ");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<b.length;k++) {
					if(c[i]==a[j] && c[i]==b[k]) {
						System.out.println(c[i]+" ");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 3 array size: ");
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[size1];
		int c[] = new int[size2];
		System.out.print("Enter 1 given array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter 2 given array element: ");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		System.out.print("Enter 3 given array element: ");
		for(int i=0;i<c.length;i++) {
			c[i]=sc.nextInt();
		}
		PrintCommonEle f = new PrintCommonEle();
		f.printCommonArr(a,b,c);
	}
}

