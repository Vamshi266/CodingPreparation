package two_pointers_and_sliding_window;

import java.util.HashSet;
import java.util.Set;

/*
 * problem link
 * https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
 */

public class SubstringsContainingAllThreeCharacters {

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static int bruteForce(String str) {
	Set<Character> set = new HashSet<>();
	int count = 0;
	int n = str.length();

	for (int i = 0; i < n; i++) {
	    for (int j = i; j < n; j++) {
		set.add(str.charAt(j));
		if (set.size() == 3) {
		    count++;
		}
	    }
	    set.clear();
	}

	return count;
    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int optimal(String str) {

	int lastSeen[] = { -1, -1, -1 };
	int count = 0;

	for (int i = 0; i < str.length(); i++) {
	    lastSeen[str.charAt(i) - 'a'] = i;

	    count += (1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])));
	}

	return count;

    }

    public static void main(String[] args) {

	String str = "abcabc";

	int res = optimal(str);

	System.out.println("res = " + res);

    }

}
