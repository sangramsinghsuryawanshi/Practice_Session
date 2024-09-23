/*
 * 2. Linked Lists
Reverse a singly linked list:

Input: 1 -> 2 -> 3 -> 4 -> 5
Output: 5 -> 4 -> 3 -> 2 -> 1
Detect a cycle in a linked list:

Input: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 3 (cycle starts at node with value 3)
Output: 3 (starting node of the cycle)
 */
package practices;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListPro 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int s = sc.nextInt();
		System.out.println("Enter array element: ");
		for(int i=0;i<s;i++)
		{
			li.add(sc.nextInt());
		}
		Collections.reverse(li);
		System.out.println(li);
	}
}
