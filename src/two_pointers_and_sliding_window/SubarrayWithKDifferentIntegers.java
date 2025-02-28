package two_pointers_and_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class SubarrayWithKDifferentIntegers {

    // Time Complexity = O(N^2)
    // Space Complexity = O(N)
    public static int bruteForce(int arr[], int k) {
	int n = arr.length;
	Map<Integer, Integer> hm = new HashMap<>();
	int count = 0;

	for (int i = 0; i < n; i++) {
	    hm.clear();
	    for (int j = i; j < n; j++) {
		hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);

		if (hm.size() == k)
		    count++;
		else if (hm.size() > k)
		    break;

	    }
	}

	return count;
    }

    public static int util(int arr[], int k) {
	int n = arr.length;
	int count = 0;
	Map<Integer, Integer> hm = new HashMap<>();

	int l = 0;
	int r = 0;

	while (r < n) {

	    hm.put(arr[r], hm.getOrDefault(arr[r], 0) + 1);

	    while (hm.size() > k && l <= r) {
		hm.put(arr[l], hm.get(arr[l]) - 1);

		if (hm.get(arr[l]) == 0)
		    hm.remove(arr[l]);

		l++;
	    }

	    count += (r - l + 1);
	    r++;
	}

	return count;

    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int optimal(int arr[], int k) {
	return util(arr, k) - util(arr, k - 1);
    }

    public static void main(String[] args) {
	int arr[] = { 1, 2, 1, 3, 4 };

	int res = bruteForce(arr, 3);

	System.out.println("res = " + res);
    }

}
