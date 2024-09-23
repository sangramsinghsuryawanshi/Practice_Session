/*
 * 4. Find All Unique Triplets That Sum to Zero
   - Input: `[-1, 0, 1, 2, -1, -4]`
   - Output: `[[-1, -1, 2], [-1, 0, 1]]`
 */
package array.practice.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueTriplets 
{
	public static void isSumZero(int a[])
	{
		List<List<Integer>> ll = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				List<Integer> l = new ArrayList<>();
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						l.add(a[i]);
						l.add(a[j]);
						l.add(a[k]);
						Collections.sort(l);
						if(!ll.contains(l))
						{
							ll.add(l);
						}
					}
				}
			}
		}
		System.out.println(ll);
	}
	public static void main(String[] args) 
	{
		int a[]= {-1, 0, 1, 2, -1, -4};
		isSumZero(a);
	}
}

