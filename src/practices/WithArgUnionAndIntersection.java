/*
 * Given two sorted arrays, find their union and intersection.
Example:

 Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
 Output: Union : {1, 2, 3, 4, 5, 6, 7} 
         Intersection : {3, 5}
 */
package practices;

import java.util.Arrays;

public class WithArgUnionAndIntersection {
	public static String isCheck(int a[],int b[]) {
		int c[]=new int[a.length+b.length];
		int x=0;
		for(int i=0;i<a.length;i++) {
			c[x++]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[x++]=b[i];
		}
		Arrays.sort(c);
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		for(int i=0;i<c.length;i++) {
			int cn=0;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					sb.append(c[i]+" ");
					cn++;
				}
			}
			if(cn==0) {
				sb1.append(c[i]+" ");
			}
			
		}
		return sb+"<>-Intersection::Union-<>"+sb1;
	}
	public static void main(String[] args) {
		int a[]= {1, 3, 4, 5, 7};
		int b[]= {2, 3, 5, 6};
		System.out.println(isCheck(a, b)+"");
	}
}
