/*
 * 2. Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.Note: Consider the array as circular.

Examples:

Input: arr[] = [1, 2, 3, 4, 5], d=2 Output: 13, 4, 5, 1, 2)

Explanation: when rotated by 2 elements, it becomes 34512

 */
package array.practice.com;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByNTimes {
	public static void isRoatated(int a[], int n) {
		for (int k = 1; k <= n; k++) {
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
		}
		System.out.println("Array Roatated is: " + Arrays.toString(a));
	}

	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		System.out.println("-------------------------");
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		System.out.println("-------------------------");
		int a[] = new int[size];
		System.out.println("Enter array element: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		isRoatated(a, n);
		sc.close();
	}
}
