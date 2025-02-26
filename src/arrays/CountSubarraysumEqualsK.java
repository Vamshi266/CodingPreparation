package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysumEqualsK {

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static int bruteForce(int arr[], int k) {

	int count = 0;
	int sum = 0;
	int n = arr.length;

	for (int i = 0; i < n; i++) {
	    sum = 0;
	    for (int j = i; j < n; j++) {
		sum += arr[j];

		if (sum == k)
		    count++;
	    }
	}

	return count;
    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int optimal(int arr[], int k) {
	int n = arr.length;
	int prefixSum = 0;
	int count = 0;

	Map<Integer, Integer> hm = new HashMap<>();

	hm.put(0, 1);

	for (int i = 0; i < n; i++) {
	    prefixSum += arr[i];

	    if (hm.containsKey(prefixSum - k)) {
		count += hm.get(prefixSum - k);
	    }

	    hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);

	}

	return count;

    }

    public static void main(String[] args) {

	int arr[] = { 1, 2, 3, -3, 1, 1, 1, 4, -2, 3 };

	int res = optimal(arr, 6);

	System.out.println("res = " + res);

    }

}
