package two_pointers_and_sliding_window;

import java.util.HashMap;

public class LongestSubstringWithUniqueChars {

    public static int bruteforce(String str) {
	HashMap<Character, Integer> hm = new HashMap<>();

	StringBuilder s = new StringBuilder();

	int n = str.length();

	int maxLen = Integer.MIN_VALUE;

	for (int i = 0; i < n; i++) {
	    s.append(str.charAt(i));

	    for (int j = i + 1; j < n; j++) {
		if (hm.containsKey(str.charAt(j)))
		    break;
		else {
		    hm.put(str.charAt(j), hm.getOrDefault(str.charAt(j), 0));
		    s.append(str.charAt(j));
		}
	    }

	    if (maxLen < s.length())
		maxLen = s.length();

	    s.setLength(0);

	}

	return maxLen;

    }

    public static int optimal(String str) {
	int l = 0;
	int r = 0;
	int maxLen = Integer.MIN_VALUE;
	int n = str.length();

	HashMap<Character, Integer> hm = new HashMap<>();

	while (r < n) {
	    if (hm.containsKey(str.charAt(r))) {
		if (hm.get(str.charAt(r)) >= l)
		    l = hm.get(str.charAt(r)) + 1;
	    }

	    maxLen = Math.max(maxLen, r - l + 1);

	    hm.put(str.charAt(r), r);

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
