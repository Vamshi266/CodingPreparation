package two_pointers_and_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static int bruteForce(String str, int k) {
	Map<Character, Integer> hm = new HashMap<>();
	int n = str.length();
	int maxLen = Integer.MIN_VALUE;
	int maxFreq = Integer.MIN_VALUE;
	int changes = 0;

	for (int i = 0; i < n; i++) {
	    maxFreq = 0;
	    for (int j = i; j < n; j++) {
		char c = str.charAt(j);
		hm.put(c, hm.getOrDefault(c, 0) + 1);

		maxFreq = Math.max(maxFreq, hm.get(c));

		changes = (j - i + 1) - maxFreq;

		if (changes <= k)
		    maxLen = Math.max(maxLen, (j - i + 1));
		else
		    break;
	    }
	    hm.clear();
	}

	return maxLen;
    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int better(String str, int k) {
	Map<Character, Integer> hm = new HashMap<>();
	int n = str.length();
	int maxLen = Integer.MIN_VALUE;
	int maxFreq = Integer.MIN_VALUE;
	char c = ' ';

	int l = 0;
	int r = 0;

	while (r < n) {
	    c = str.charAt(r);
	    hm.put(c, hm.getOrDefault(c, 0) + 1);

	    maxFreq = Math.max(maxFreq, hm.get(c));

	    while ((r - l + 1) - maxFreq > k) {
		c = str.charAt(l);
		hm.put(c, hm.get(c) - 1);
// this can be removed
//		maxFreq = 0;
//		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//		    maxFreq = Math.max(maxFreq, entry.getValue());
//		}
		l++;
	    }

	    maxLen = Math.max(maxLen, r - l + 1);
	    r++;
	}

	return maxLen;

    }

    public static int optimal(String str, int k) {
	Map<Character, Integer> hm = new HashMap<>();
	int n = str.length();
	int maxLen = Integer.MIN_VALUE;
	int maxFreq = Integer.MIN_VALUE;
	char c = ' ';

	int l = 0;
	int r = 0;

	while (r < n) {
	    c = str.charAt(r);
	    hm.put(c, hm.getOrDefault(c, 0) + 1);

	    maxFreq = Math.max(maxFreq, hm.get(c));

	    if ((r - l + 1) - maxFreq > k) {
		c = str.charAt(l);
		hm.put(c, hm.get(c) - 1);
		l++;
	    }

	    maxLen = Math.max(maxLen, r - l + 1);
	    r++;
	}

	return maxLen;
    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static void main(String[] args) {
	String str = "AABABBA";

	int res = optimal(str, 1);
	System.out.println("res = " + res);
    }

}
