package two_pointers_and_sliding_window;

public class MaxPointsFromCards {

    // Time Complexity = O(K)
    // Space Complexity = O(1)
    public static int optimal(int arr[], int k) {
	int lsum = 0;
	int rsum = 0;
	int maxSum = Integer.MIN_VALUE;
	int n = arr.length;

	for (int i = 0; i < k; i++) {
	    lsum += arr[i];
	}

	maxSum = lsum;
	int index = n - 1;

	for (int j = k - 1; j >= 0; j--) {
	    lsum -= arr[j];
	    rsum += arr[index];
	    index--;
	    maxSum = Math.max(maxSum, lsum + rsum);
	}

	return maxSum;
    }

    public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 4, 5, 6, 1 };

	int res = optimal(arr, 4);
	System.out.println("res = " + res);
    }
}
