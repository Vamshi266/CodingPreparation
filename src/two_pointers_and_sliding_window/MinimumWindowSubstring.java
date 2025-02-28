package two_pointers_and_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    // N = s.length() , M = t.length()
    // Time Complexity = O(N x M)
    // SpaceComplexity = O(1)
    public static String bruteForce1(String s, String t) {
	int n = s.length();
	boolean flag = true;
	StringBuilder res = new StringBuilder();
	HashMap<Character, Integer> hm1 = new HashMap<>();
	HashMap<Character, Integer> hm2 = new HashMap<>();

	int minLen = Integer.MAX_VALUE;
	for (int i = 0; i < t.length(); i++) {
	    hm1.put(t.charAt(i), hm1.getOrDefault(t.charAt(i), 0) + 1);
	}

	for (int i = 0; i < n; i++) {
	    int j = i;
	    hm2.clear();
	    flag = true;

	    for (j = i; j < n; j++) {
		hm2.put(s.charAt(j), hm2.getOrDefault(s.charAt(j), 0) + 1);
	    }

	    for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
		if ((hm2.containsKey(entry.getKey()) && (entry.getValue() <= hm2.get(entry.getKey()))))
		    continue;
		else {
		    flag = false;
		    break;
		}
	    }

	    if (flag) {
		if (j - i + 1 < minLen) {
		    minLen = j - i + 1;
		    res.setLength(0);
		    for (int k = i; k < j; k++) {
			res.append(s.charAt(k));
		    }
		}
	    }

	}

	return res.toString();
    }

    // N = s.length() , M = t.length()
    // Time Complexity = O(N x M)
    // SpaceComplexity = O(1)
    public static String bruteForce2(String s, String t) {

	int minLen = Integer.MAX_VALUE;
	HashMap<Character, Integer> hm = new HashMap<>();
	int count = 0;
	int sIndex = -1;

	for (int i = 0; i < s.length(); i++) {
	    hm.clear();
	    count = 0;
	    for (int j = 0; j < t.length(); j++) {
		hm.put(t.charAt(j), hm.getOrDefault(t.charAt(j), 0) + 1);
	    }

	    for (int j = i; j < s.length(); j++) {
		if (hm.containsKey(s.charAt(j)) && (hm.get(s.charAt(j)) > 0)) {
		    hm.put(s.charAt(j), hm.get(s.charAt(j)) - 1);
		    count++;
		} else {
		    hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), -1) - 1);
		}

		if (count == t.length()) {
		    if ((j - i + 1) < minLen) {
			minLen = Math.min(j - i + 1, minLen);
			sIndex = i;
			break;
		    }
		}

	    }
	}

	if (sIndex != -1)
	    return s.substring(sIndex, sIndex + minLen);
	else
	    return "";

    }

    public static String optimal(String s, String t) {
	int minLen = Integer.MAX_VALUE;
	int count = 0;
	int sIndex = -1;
	HashMap<Character, Integer> hm = new HashMap<>();

	for (int j = 0; j < t.length(); j++) {
	    hm.put(t.charAt(j), hm.getOrDefault(t.charAt(j), 0) + 1);
	}

	int l = 0;
	int r = 0;

	int n = s.length();
	int m = t.length();

	while (r < n) {

	    if (hm.containsKey(s.charAt(r)) && (hm.get(s.charAt(r)) > 0)) {
		hm.put(s.charAt(r), hm.get(s.charAt(r)) - 1);
		count++;
	    } else {
		hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), -1) - 1);
	    }

	    while (count == m) {
		if (r - l + 1 < minLen) {
		    minLen = r - l + 1;
		    sIndex = l;
		}

		if (hm.containsKey(s.charAt(l)) && (hm.get(s.charAt(l)) < 0)) {
		    hm.put(s.charAt(l), hm.get(s.charAt(l)) + 1);
		} else if (hm.containsKey(s.charAt(l)) && hm.get(s.charAt(l)) == 0) {
		    hm.put(s.charAt(l), hm.get(s.charAt(l)) + 1);
		    count--;
		} else {
		    hm.put(s.charAt(l), hm.getOrDefault(s.charAt(l), -1) + 1);
		}

		l++;
	    }

	    r++;
	}

	if (sIndex != -1)
	    return s.substring(sIndex, sIndex + minLen);
	else
	    return "";

    }

    public static void main(String[] args) {

	String s = "ADOBECODEBANC";
	String t = "ABC";

	String res = optimal(s, t);
	System.out.println("res = " + res);

    }

}
