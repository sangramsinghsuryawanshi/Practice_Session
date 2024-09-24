package matrix.com;

public class MaxSum {

    // Function to implement Kadane's algorithm on a 1D array
    public static int kadane(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    // Function to find the maximum sum rectangle in a 2D matrix
    public static int maxSumRectangle(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxSum = Integer.MIN_VALUE;

        // Start column
        for (int left = 0; left < cols; left++) {
            // Array to store the sum of elements for each row between left and right columns
            int[] temp = new int[rows];

            // End column
            for (int right = left; right < cols; right++) {
                // Summing rows for the current range of columns (left to right)
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }

                // Applying Kadane's algorithm on the row sums to find the maximum sum subarray
                int currentMaxSum = kadane(temp);
                if (currentMaxSum > maxSum) {
                    maxSum = currentMaxSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, -1}, {2, 3, 4}, {-1, -2, 1}};
        System.out.println("Maximum sum rectangle: " + maxSumRectangle(matrix));
    }
}
