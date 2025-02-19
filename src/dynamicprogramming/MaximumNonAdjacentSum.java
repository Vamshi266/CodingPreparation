package dynamicprogramming;

public class MaximumNonAdjacentSum {

    // R - recursion
    // M - memoization
    // T - tabulation
    // ME - memory efficient

    // Time Complexity = O(2^N)
    // Space Compexity = O(N)
    public static int utilR(int i, int[] arr) {
	if (i == 0)
	    return arr[0];
	if (i < 0)
	    return 0;

	int p = arr[i - 2] + utilR(i - 2, arr);
	int np = 0 + utilR(i - 1, arr);

	return Math.max(p, np);
    }

    // Time Complexity = O(N)
    // Space Compexity = O(N) + O(N)
    public static int utilM(int i, int[] arr, int dp[]) {
	if (i == 0)
	    return arr[0];
	if (i < 0)
	    return 0;

	if (dp[i] != -1)
	    return dp[i];

	int p = arr[i - 2] + utilR(i - 2, arr);
	int np = 0 + utilR(i - 1, arr);

	dp[i] = Math.max(p, np);

	return dp[i];
    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int utilT(int[] arr) {
	int n = arr.length;
	int dp[] = new int[n];

	dp[0] = arr[0];

	for (int i = 1; i < n; i++) {
	    int p = arr[i];
	    if (i > 1)
		p += dp[i - 2];

	    int np = 0 + dp[n - 1];

	    dp[i] = Math.max(p, np);
	}

	return dp[n - 1];
    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int utilME(int[] arr) {
	int prev = 0;
	int prev2 = 0;
	int curr = 0;
	int neg = 0;
	int n = arr.length;

	for (int i = 1; i < n; i++) {
	    int p = arr[i];
	    if (i > 1)
		p += prev2;

	    int np = 0 + prev;
	    curr = Math.max(p, np);

	    prev2 = prev;
	    prev = curr;
	}

	return prev;
    }

}
