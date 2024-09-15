package practices;

import java.util.Scanner;

public class ShiftArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int c[]=new int[size];
		int c1=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				c[i]=a[i];
				c1++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				c[c1]=a[i];
				c1++;
			}
		}
		System.out.print("\nGiven sequence is: ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
