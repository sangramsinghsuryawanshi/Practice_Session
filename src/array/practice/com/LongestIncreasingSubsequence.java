package array.practice.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {

    public static void isLIS(int[] a) {
        List<Integer> li = new ArrayList<>();
        
        for (int n : a) {
            // Use binary search to find the correct position for 'n'
            int pos = Collections.binarySearch(li, n);
            
            // If not found, binarySearch returns negative value, adjust the index
            if (pos < 0) {
                pos = -(pos + 1);
            }
            
            // If position is within the list, replace the element, otherwise append
            if (pos < li.size()) {
                li.set(pos, n);
            } else {
                li.add(n);
            }
        }
        
        // The size of the list is the length of the Longest Increasing Subsequence
        System.out.println("Length of LIS: " + li.size());
    }

    public static void main(String[] args) {
        int a[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        isLIS(a);  // Expected length of LIS: 6 (LIS could be: [0, 2, 6, 9, 11, 15])
    }
}
