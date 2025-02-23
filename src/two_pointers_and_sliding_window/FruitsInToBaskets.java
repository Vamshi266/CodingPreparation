package two_pointers_and_sliding_window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 
 * problem link
 * https://leetcode.com/problems/fruit-into-baskets/description/
 * 
 * 
 */

public class FruitsInToBaskets {

    public static int bruteForce(int[] fruits) {
	int n = fruits.length;
	int maxLen = Integer.MIN_VALUE;

	for (int i = 0; i < n; i++) {
	    Set<Integer> baskets = new HashSet<>();

	    for (int j = i; j < n; j++) {
		if (baskets.size() <= 2) {
		    baskets.add(fruits[j]);
		    maxLen = Math.max(maxLen, j - i + 1);
		} else
		    break;
	    }
	}

	return maxLen;
    }

    public static int better(int fruits[]) {
	int n = fruits.length;
	int maxLen = Integer.MIN_VALUE;

	Map<Integer, Integer> hm = new HashMap<>();

	int l = 0;
	int r = 0;

	while (r < n) {
	    hm.put(fruits[r], hm.getOrDefault(fruits[r], 0) + 1);

	    if (hm.size() > 2) {
		while (hm.size() > 2) {

		    hm.put(fruits[l], hm.get(hm.get(fruits[l])) - 1);

		    if (hm.get(fruits[l]) == 0)
			hm.remove(fruits[l]);

		    l++;
		}
	    }

	    maxLen = Math.max(maxLen, r - l + 1);
	    r++;
	}

	return maxLen;

    }

    public static int optimal(int fruits[]) {
	int n = fruits.length;
	int maxLen = Integer.MIN_VALUE;

	Map<Integer, Integer> hm = new HashMap<>();

	int l = 0;
	int r = 0;

	while (r < n) {
	    hm.put(fruits[r], hm.getOrDefault(fruits[r], 0) + 1);

	    if (hm.size() > 2) {
		hm.put(fruits[l], hm.get(fruits[l]) - 1);

		if (hm.get(fruits[l]) == 0)
		    hm.remove(fruits[l]);

		l++;
	    }

	    maxLen = Math.max(maxLen, r - l + 1);
	    r++;
	}

	return maxLen;
    }

    public static void main(String[] args) {

	int arr[] = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };

	int res = optimal(arr);

	System.out.println("maxLen = " + res);

    }

}
