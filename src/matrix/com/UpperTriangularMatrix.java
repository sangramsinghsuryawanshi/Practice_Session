package matrix.com;

import java.util.Scanner;

public class UpperTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][]=new int[row][col];
		System.out.println("Enter given matrix: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Given upper triangular matrix is: ");
		int y=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i>j) {
					System.out.print(y+" ");
				}else {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		System.out.println("Given lower triangular matrix is: ");
		int k=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i<j) {
					System.out.print(k+" ");
				}else {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
