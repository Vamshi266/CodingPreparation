package dynamicprogramming;

import java.util.Arrays;

public class FrogJump {

    // recursion
    // Time Complexity = O(2^N)
    // Space Compleixty = O(N)[stack]
    public static int utilv1(int i, int[] heights) {
	if (i == 0)
	    return 0;

	int l = Integer.MAX_VALUE;
	int r = Integer.MAX_VALUE;

	l = utilv1(i - 1, heights) + (heights[i] - heights[i - 1]);
	r = utilv1(i - 2, heights) + (heights[i] - heights[i - 2]);

	return Math.min(l, r);
    }

    // memoization
    // Time Complexity = O(N)
    // Space Complexity = O(N)[stack] + O(N)[array]
    public static int utilv2(int i, int heights[], int dp[]) {
	if (i == 0)
	    return 0;

	if (dp[i] != -1)
	    return dp[i];

	int l = Integer.MAX_VALUE;
	int r = Integer.MAX_VALUE;

	l = utilv2(i - 1, heights, dp) + Math.abs(heights[i] - heights[i - 1]);

	if (i > 1)
	    r = utilv2(i - 2, heights, dp) + Math.abs(heights[i] - heights[i - 2]);

	dp[i] = Math.min(l, r);
	return dp[i];
    }

    // tabulation
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int utilv3(int n, int heights[], int dp[]) {
	dp[0] = 0;

	int l = Integer.MAX_VALUE;
	int r = Integer.MAX_VALUE;
	for (int k = 1; k < n; k++) {
	    l = dp[k - 1] + Math.abs(heights[k] - heights[k - 1]);

	    if (k > 1) {
		r = dp[k - 2] + Math.abs(heights[k] - heights[k - 2]);
	    }

	    dp[k] = Math.min(l, r);
	}

	return dp[n - 1];
    }

    // space optimized
    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int utilv4(int n, int heights[]) {

	int l = Integer.MAX_VALUE;
	int r = Integer.MAX_VALUE;

	int prev = 0;
	int prev2 = 0;

	int curr = 0;

	for (int k = 1; k < n; k++) {
	    l = prev + Math.abs(heights[k] - heights[k - 1]);

	    if (k > 1) {
		r = prev2 + Math.abs(heights[k] - heights[k - 2]);
	    }

	    curr = Math.min(l, r);

	    prev2 = prev;
	    prev = curr;
	}

	return curr;
    }

    public static int frogJump(int n, int heights[]) {

	int dp[] = new int[n + 1];
	Arrays.fill(dp, -1);
	return utilv2(heights.length, heights, dp);

    }

}
