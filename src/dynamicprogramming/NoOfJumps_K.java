package dynamicprogramming;

import java.util.Arrays;

public class NoOfJumps_K {

    // recursion
    // Time Complexity = O(N*K)
    // Space Complexity = O(N)[stack]
    public static int frogJump(int i, int n, int k, int[] arr) {
	if (i == 0)
	    return 0;

	int minSteps = Integer.MAX_VALUE;

	for (int j = 1; j <= k; j++) {

	    if (i - j >= 0) {
		int res = frogJump(i - j, minSteps, k, arr) + Math.abs(arr[i] - arr[i - j]);
		minSteps = Math.min(minSteps, res);
	    }
	}

	return minSteps;
    }

    public static int frogJumpv2(int i, int n, int k, int[] arr, int dp[]) {

	if (dp[i] != -1)
	    return dp[i];

	if (i == 0)
	    return 0;

	int minSteps = Integer.MAX_VALUE;

	for (int j = 1; j <= k; j++) {

	    if (i - j >= 0) {

		dp[i] = frogJump(i - j, minSteps, k, arr) + Math.abs(arr[i] - arr[i - j]);
		minSteps = Math.min(minSteps, dp[i]);
	    }
	}

	return minSteps;
    }

    // Time Complexity = O(N*K)
    // Space Complexity = O(N)
    public static int frogJumpv3(int n, int k, int[] arr, int dp[]) {
	dp[0] = 0;

	int minSteps;
	for (int i = 1; i <= n; i++) {
	    minSteps = Integer.MAX_VALUE;

	    for (int j = 1; j <= k; j++) {
		if (i - j >= 0) {
		    int res = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
		    minSteps = Math.min(minSteps, res);
		}

		dp[i] = minSteps;
	    }
	}

	return dp[n - 1];
    }

    public static void main(String[] args) {

	int arr[] = { 30, 10, 60, 10, 60, 50 };
	int dp[] = new int[6];

	Arrays.fill(dp, -1);
	int ans = frogJumpv3(arr.length - 1, 2, arr, dp);

	System.out.print("min energy required = " + ans);

    }
}
