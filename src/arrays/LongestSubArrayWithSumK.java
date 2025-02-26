package arrays;

import java.util.HashMap;

/*
 * problem link
 * https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
 * 
 */

public class LongestSubArrayWithSumK {

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static int bruteForce(int arr[], int k) {
	int maxLen = 0;
	int n = arr.length;
	int sum = 0;

	for (int i = 0; i < n; i++) {
	    sum = 0;
	    for (int j = i; j < n; j++) {
		sum += arr[j];

		if (sum == k)
		    maxLen = Math.max(maxLen, j - i + 1);
	    }
	}

	return maxLen;

    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    // this is used for both +ve and -ve values are present in array
    public static int better(int arr[], int k) {
	int sum = 0;
	int maxLen = 0;
	HashMap<Integer, Integer> hm = new HashMap<>();

	for (int i = 0; i < arr.length; i++) {
	    sum += arr[i];
	    if (sum == k)
		maxLen = Math.max(maxLen, i + 1);

	    int rem = sum - k;

	    if (hm.containsKey(rem)) {
		int len = i - hm.get(rem);
		maxLen = Math.max(maxLen, len);
	    }

	    if (!hm.containsKey(sum)) {
		hm.put(sum, i);
	    }
	}

	return maxLen;
    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    // this is used if there are only +ve and 0 values in the array
    public static int optimal(int arr[], int k) {

	int maxLen = 0;
	int l = 0;
	int r = 0;
	int n = arr.length;
	int sum = 0;

	while (r < n) {
	    sum += arr[r];

	    if (sum == k)
		maxLen = Math.max(maxLen, r - l + 1);

	    while (l <= r && sum > k) {
		sum -= arr[l];
		l++;
	    }

	    r++;
	}

	return maxLen;

    }

    public static void main(String[] args) {

	int arr[] = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
	int res = optimal(arr, 6);
	System.out.println("the sub array with max len = " + res);

    }

}
