package dynamicprogramming;

import java.util.Arrays;

public class NoOfJumps {

    // recursion
    public static int noOfJumps(int n) {
	if (n <= 1)
	    return 1;

	int l = noOfJumps(n - 1);
	int r = noOfJumps(n - 2);

	return l + r;
    }

    // memoization
    public static int noOfJumps(int n, int[] dp) {
	if (n <= 1) {
	    return dp[n] = 1;
	}

	if (dp[n] != -1)
	    return dp[n];

	dp[n] = noOfJumps(n - 1, dp) + noOfJumps(n - 2, dp);
	return dp[n];
    }

    // tabulation
    public static int noOfJumpsv2(int n) {
	int dp[] = new int[n + 1];

	dp[0] = 1;
	dp[1] = 1;

	for (int i = 2; i <= n; i++) {
	    dp[i] = dp[i - 1] + dp[i - 2];
	}

	return dp[n];
    }

    public static void main(String[] args) {
	int n = 3;
	int[] dp = new int[n + 1];

	Arrays.fill(dp, -1);

	int ans = noOfJumpsv2(n);

	System.out.println("no of jumps = " + ans);

    }

}
