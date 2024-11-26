/*
 * 4. In array print the pairs of number whose sum is even, without using % operator and without using predefined methods.

 */
package array.practice.com;

import java.util.Scanner;

public class FindSumPair {
	public static void isEvenPair(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				float sum = a[i] + a[j];
				if (sum / 2 == (int) sum / 2) {
					System.out.print("(" + a[i] + "," + a[j] + ")");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("-------------------------");
		int a[] = new int[size];
		System.out.println("Enter array element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("----------------------");
		System.out.println("Even pairs sum: ");
		isEvenPair(a);
		sc.close();
	}
}
