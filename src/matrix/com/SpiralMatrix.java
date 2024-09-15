/*
 * 00 01 02  1 2 3 
 * 10 11 12  4 5 6
 * 20 21 22  7 8 9
 * 3 3
   1 2 3
   4 5 6
   7 8 9
 */

package matrix.com;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter given matrix:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int top=0,bottom=a.length-1;
		int right=a.length-1,left=0;
		System.out.println("Spieral matix is:");
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				System.out.print(a[top][i]+" ");
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
		}
		}

}
