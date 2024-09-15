/*
 * * 
 *  1 *
 *  1 2 1 *
 *  1 2 3 2 1*
 *  1 2 1 *
 *  1 *
 *
 */

package star.mix.pattern;

import java.util.Scanner;

public class MixPatternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number ");
		int n=sc.nextInt();
		System.out.print("\n------------------");
		for(int i=1;i<=n;i+=2) {
			int c=1;
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j) {
					System.out.print("* ");
				}
				else {
					if(j<=i/2) {
						System.out.print((c++)+" ");
					}else {
						System.out.print((c--)+" ");
					}
				}
			}
			System.out.println();
		}
		for(int i=n;i>=1;i=i-2) {
			int c=1;
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j) {
					System.out.print("* ");
				}
				else {
					if(j<=i/2) {
						System.out.print((c++)+" ");
					}else {
						System.out.print((c--)+" ");
					}
				}
			}
			System.out.println();
		}
	}

}
