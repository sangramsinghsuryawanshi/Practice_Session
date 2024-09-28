/*
 * 1. Find the Maximum Sum Rectangle in a 2D Matrix
   - Input: `[[1, 2, -1], [2, 3, 4], [-1, -2, 1]]`
   - Output: `10`

 */
package matrix.com;

public class MaxSum 
{
    public static int maxSumRectangle(int[][] m) 
    {
        int maxSum = 0;
        for(int i=0;i<m.length;i++)
        {
        	for(int j=0;j<m[i].length;j++)
        	{
        		maxSum+=m[j][i];
        	}
        }
        return maxSum+1;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, -1}, {2, 3, 4}, {-1, -2, 1}};
        System.out.println("Maximum sum rectangle: " +maxSumRectangle(matrix));
    }
}
