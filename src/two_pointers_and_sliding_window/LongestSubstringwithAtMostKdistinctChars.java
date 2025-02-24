package two_pointers_and_sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * problem link
 * https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
 * 
 */

public class LongestSubstringwithAtMostKdistinctChars {

//      Time Complexity = O(N^2) 
//      Space Complexity = O(1)

    public static int bruteForce(String str, int k) {
	int maxLen = Integer.MIN_VALUE;
	Set<Character> set = new HashSet<>();
	int n = str.length();

	for (int i = 0; i < n; i++) {
	    for (int j = i; j < n; j++) {
		set.add(str.charAt(j));

		if (set.size() > 2)
		    break;
		else
		    maxLen = Math.max(maxLen, j - i + 1);
	    }
	    set.clear();
	}

	if (k > set.size())
	    return -1;

	return maxLen;
    }

//      Time Complexity = O(2N)
//      Space Complexity = O(1)

    public static int better(String str, int k) {
	int maxLen = Integer.MIN_VALUE;
	Map<Character, Integer> hm = new HashMap<>();
	int n = str.length();

	int l = 0;
	int r = 0;

	while (r < n) {
	    hm.put(str.charAt(r), hm.getOrDefault(str.charAt(r), 0) + 1);

	    while (hm.size() > k) {
		hm.put(str.charAt(l), hm.get(str.charAt(l)) - 1);

		if (hm.get(str.charAt(l)) == 0)
		    hm.remove(str.charAt(l));
		l++;
	    }

	    maxLen = Math.max(maxLen, r - l + 1);
	    r++;
	}

	if (k > hm.size())
	    return -1;

	return maxLen;
    }

//      Time Complexity = O(N) 
//      Space Complexity = O(1)

    public static int optimal(String str, int k) {
	int maxLen = Integer.MIN_VALUE;
	Map<Character, Integer> hm = new HashMap<>();
	int n = str.length();

	int l = 0;
	int r = 0;

	while (r < n) {
	    hm.put(str.charAt(r), hm.getOrDefault(str.charAt(r), 0) + 1);

	    if (hm.size() > k) {
		hm.put(str.charAt(l), hm.get(str.charAt(l)) - 1);

		if (hm.get(str.charAt(l)) == 0)
		    hm.remove(str.charAt(l));
		l++;
	    }

	    maxLen = Math.max(maxLen, r - l + 1);
	    r++;
	}

	if (k > hm.size())
	    return -1;

	return maxLen;
    }

    public static void main(String[] args) {

	String str = "aaabbccd";

	int res = better(str, 2);

	System.out.println("maxLen = " + res);

    }

}
