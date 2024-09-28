/*
 * 4. Find the Maximum Sum Submatrix
   - Input: `[[1, 2, -1], [2, 3, 4], [-1, -2, 1]]`
   - Output: `10`

 */
package matrix.com;

public class MaxSubSum 
{
	 public static int maxSS(int[][] m) 
	 {
		 int curMa=0;
	        for(int i=0;i<m.length;i++)
	        {
	        	for(int j=0;j<m[i].length;j++)
	        	{
	        		for(int k=i;k<m.length;k++)
	        		{
	        			int maxSum = 0;
	        			for(int l=j;l<m[k].length;l++)
	        			{
	        				maxSum+=m[k][l];
	        			}
	        			curMa=Math.max(curMa, maxSum);
	        			
	        		}
	        		
	        	}
	        }
	        return curMa+1;
	    }
	public static void main(String[] args) 
	{
		int a[][]= {{1, 2, -1},{2, 3, 4},{-1, -2, 1}};
		System.out.println(maxSS(a));
	}
}
