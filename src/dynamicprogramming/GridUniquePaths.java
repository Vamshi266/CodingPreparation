package dynamicprogramming;

import java.util.Arrays;

public class GridUniquePaths {

    public static int uniquePaths(int m, int n) {

	int dp[][] = new int[m][n];
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++) {
		dp[i][j] = -1;
	    }
	}
	return utilv2(m - 1, n - 1, dp);

    }

    // Time Complexity = O(2^(M * N))
    // Space Complexity = O((M-1)+(N-1))
    // Recursion
    public static int utilv1(int i, int j) {
	if (i == 0 && j == 0)
	    return 1;

	if (i < 0 || j < 0)
	    return 0;

	int up = utilv1(i - 1, j);
	int left = utilv1(i, j - 1);

	return up + left;
    }

    // Time Complexity = O(M*N)
    // Space Complexity = O((M-1)+(N-1)+ O(M*N))
    // Memozation
    public static int utilv2(int i, int j, int[][] dp) {

	if (i == 0 && j == 0)
	    return 1;

	if (i < 0 || j < 0)
	    return 0;

	if (dp[i][j] != -1)
	    return dp[i][j];

	int up = utilv2(i - 1, j, dp);
	int left = utilv2(i, j - 1, dp);

	dp[i][j] = up + left;

	return dp[i][j];

    }

    // Time Complexity = O(M*N)
    // Space Complexity = O(M*N)
    // Tabulation
    public static int utilv3(int m, int n) {
	int dp[][] = new int[m][n];

	int up = 0, left = 0;
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++) {
		if (i == 0 && j == 0)
		    dp[0][0] = 1;
		else {
		    if (i > 1)
			up = dp[i - 1][j];

		    if (j > 1)
			left = dp[i][j - 1];

		    dp[i][j] = up + left;
		}
	    }
	}

	return dp[m - 1][n - 1];
    }

    // Time Complexity = O(M*N)
    // Space Complexity = O(1)
    // Memory Optimized
    public static int utilv4(int m, int n) {
	int up = 0, left = 0;

	int prevRow[] = new int[m];
	Arrays.fill(prevRow, 0);
	int currRow[] = new int[m];
	Arrays.fill(currRow, 0);
	for (int i = 0; i < m; i++) {
	    Arrays.fill(currRow, 0);
	    for (int j = 0; j < n; j++) {
		if (i == 0 && j == 0)
		    currRow[i] += 1;
		else {
		    currRow[j] = currRow[j - 1] + prevRow[j];
		}
	    }
	}

	return currRow[m - 1];
    }

}
