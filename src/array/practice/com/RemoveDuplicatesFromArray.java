/*
 * 3. From a given array remove duplicate elements in Java. For eg-Input array =

5,9,10,5,9,0,45,66,89,66), result array = (5,9,10,0,45,66,89). Your program should work with any given array of numbers.

1578910

 */
package array.practice.com;

import java.util.Scanner;

public class RemoveDuplicatesFromArray {
	public static void isRemovedDuplicate(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					cnt++;
					a[j] = -1;
				}
			}
			if (cnt == 0 && a[i] != -1) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] ar) {
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
		System.out.println("Removed Duplicates: ");
		isRemovedDuplicate(a);
		sc.close();
	}
}
