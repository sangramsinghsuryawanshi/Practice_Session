package matrix.com;

import java.util.Scanner;

public class RowAndColMatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][]=new int[row][col];
		int pdsum=0,dsum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			int rsum=0,csum=0;
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					dsum+=a[i][j];
				}
				if((i+j)==2)
				{
					pdsum+=a[j][i];
				}
				rsum+=a[i][j];
				csum+=a[j][i];
				
			}
			System.out.println("Row sum: "+rsum);
			System.out.println("Coloumn sum: "+csum);
		}
		System.out.println("Primaray digonal sum: "+pdsum);
		System.out.println("Digonal sum: "+dsum);
	}

}
