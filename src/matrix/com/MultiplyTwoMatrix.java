package matrix.com;

public class MultiplyTwoMatrix 
{
    public static void isMul(int a[][], int b[][])
    {
        // Assuming that a is m x n and b is n x p
        int result[][] = new int[a.length][b[0].length];
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Printing the result matrix
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        int a[][] = {{1, 2}, {3, 4}, {5, 6}};
        int b[][] = {{1, 2, 3}, {4, 5, 6}};
        isMul(a, b);
    }
}
