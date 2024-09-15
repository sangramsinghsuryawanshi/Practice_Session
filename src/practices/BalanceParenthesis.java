/*
 * Q1.(Using Stack)

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed
 */
package practices;

import java.util.Stack;

public class BalanceParenthesis {
	public static boolean isBal(String str) {
		char ch[] = str.toCharArray();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '[' || ch[i] == '{' || ch[i] == '(') {
				st.add(ch[i]);
			} else {
				if (st.isEmpty()) {
					return false;
				} else {
					char pop = (char) st.pop();
					if (ch[i] == ']' && pop != '[' || ch[i] == '}' && pop != '{' || ch[i] == ')' && pop != '(') {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "[()]{}{[()()]()}";
		if (isBal(str)) {
			System.out.println("Balanced...");
		} else {
			System.out.println("Not Balanced..");
		}
	}
}
