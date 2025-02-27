package two_pointers_and_sliding_window;

/*
 * problem link
 * https://leetcode.com/problems/binary-subarrays-with-sum/
 */

public class BinarySubarraysWithSum {

    // Time Complexity = O(N^3)
    // Space Complexity = O(1)
    public static int bruteForce(int arr[], int goal) {
	int n = arr.length;
	int sum = 0;
	int count = 0;

	for (int i = 0; i < n; i++) {
	    for (int j = i; j < n; j++) {
		sum = 0;
		for (int k = i; k <= j; k++)
		    sum += arr[k];

		if (sum == goal)
		    count++;
	    }
	}

	return count;

    }

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static int better(int arr[], int goal) {
	int n = arr.length;
	int sum = 0;
	int count = 0;

	for (int i = 0; i < n; i++) {
	    sum = 0;
	    for (int j = i; j < n; j++) {
		sum += arr[j];

		if (sum == goal)
		    count++;
	    }
	}

	return count;

    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    // this computes all the subarrays with sum <= k
    public static int util(int arr[], int k) {
	if (k < 0)
	    return 0;

	int n = arr.length;
	int sum = 0;
	int count = 0;

	int l = 0;
	int r = 0;

	while (r < n) {

	    sum += arr[r];

	    while (sum > k) {
		sum -= arr[l];
		l++;
	    }

	    count += (r - l + 1);
	    r++;
	}

	return count;
    }

    // util(arr, k) - util(arr, k - 1) = subarrays with sum k
    public static int optimal(int arr[], int k) {

	return util(arr, k) - util(arr, k - 1);

    }

    public static void main(String[] args) {

    }

}
