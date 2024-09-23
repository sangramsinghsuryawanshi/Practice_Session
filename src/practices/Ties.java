package practices;

import java.util.ArrayList;
import java.util.List;

/*
 * 10. Tries
Find all words in a string that can be formed by concatenating words from a dictionary:
Input: String: "catsanddog", Dictionary: ["cat", "cats", "and", "sand", "dog"]
Output: ["cats and dog", "cat sand dog"]
 */
public class Ties 
{
	 public static void main(String[] args) {
	        String str = "catsanddog";
	        String[] wordDict = {"cat", "cats", "and", "sand", "dog"};
	        List<String> result = new ArrayList<>();
	        wordBreakHelper(str, wordDict, "", result);
	        
	        // Print the result
	        System.out.println(result);
	    }

	    // Helper function to perform word break using backtracking
	    public static void wordBreakHelper(String str, String[] wordDict, String current, List<String> result) {
	        // If the input string is empty, add the current formed sentence to result
	        if (str.length() == 0) {
	            result.add(current.trim()); // Add trimmed sentence to remove extra space
	            return;
	        }

	        // Try to match each word in the dictionary
	        for (String word : wordDict) {
	            if (str.startsWith(word)) {
	                // If the word is a prefix of the current string, recurse with the remaining string
	                wordBreakHelper(str.substring(word.length()), wordDict, current + word + " ", result);
	            }
	        }
	    }
	}