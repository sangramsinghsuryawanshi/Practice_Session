/*
 * Question: What is the output when sorting the array [3, 1, 4, 2] in ascending order?

Output: [1, 2, 3, 4]
 */
package array.practice.com;

import java.util.Arrays;

public class AscendingOrder {
	
	public static int[] isSort(int a[]) {
		Arrays.sort(a);
		return a;
	}
	public static void main(String[] args) {
		int a[] = {3, 1, 4, 2};
		System.out.println("Ascending order: "+Arrays.toString(isSort(a)));
	}

}
