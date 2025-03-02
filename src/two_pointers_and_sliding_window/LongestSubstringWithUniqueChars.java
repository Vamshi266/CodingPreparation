package two_pointers_and_sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithUniqueChars {

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static int bruteforce(String str) {
	int n = str.length();
	Set<Character> set = new HashSet<>();
	int maxLen = Integer.MIN_VALUE;

	for (int i = 0; i < n; i++) {
	    set.clear();
	    for (int j = i; j < n; j++) {
		if (!set.contains(str.charAt(j)))
		    set.add(str.charAt(j));
		else {
		    maxLen = Math.max(maxLen, j - i);
		    break;
		}
	    }
	}

	return maxLen;

    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int optimal(String str) {

	if (str.length() == 0)
	    return 0;

	HashMap<Character, Integer> hm = new HashMap<>();
	int maxLen = Integer.MIN_VALUE;

	int l = 0;
	int r = 0;
	int n = str.length();

	while (r < n) {
	    if (hm.containsKey(str.charAt(r))) {
		// if the index of repeating character is greater than that of in the hashmap
		// update it to (index+1) in hashmap that means move l to next of repeating
		// character
		if (hm.get(str.charAt(r)) >= l)
		    l = hm.get(str.charAt(r)) + 1;
	    }

	    // update the new char index to r
	    hm.put(str.charAt(r), r);

	    // compute maxLen
	    maxLen = Math.max(maxLen, r - l + 1);

	    // move r
	    r++;
	}

	return maxLen;

    }

    public static void main(String[] args) {

	String str = "cadbzabcd";

	int res = optimal(str);

	System.out.println("length of longestSubstringwithuniquechars = " + res);

    }

}
