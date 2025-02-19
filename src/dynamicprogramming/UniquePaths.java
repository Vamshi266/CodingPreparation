package dynamicprogramming;

public class UniquePaths {

    static int val = (int) (1e10 * 2);

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

	int n = obstacleGrid.length;
	int m = obstacleGrid[0].length;

	int dp[][] = new int[n][m];
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		dp[i][j] = -1;
	    }
	}

	return util(obstacleGrid, dp) % val;
    }

    // Recursion
    static int utilv1(int i, int j, int mat[][]) {
	if (i >= 0 && j >= 0 && mat[i][j] == -1)
	    return 0;

	if (i == 0 && j == 0)
	    return 1;

	if (i < 0 || j < 0)
	    return 0;

	int up, left;

	up = utilv1(i - 1, j, mat);
	left = utilv1(i, j - 1, mat);

	return (up + left) % val;
    }

    // Memoization
    static int utilv2(int i, int j, int mat[][], int[][] dp) {
	if (i >= 0 && j >= 0 && mat[i][j] == -1)
	    return 0;

	if (i == 0 && j == 0)
	    return 1;

	if (i < 0 || j < 0)
	    return 0;

	if (dp[i][j] != -1)
	    return dp[i][j];

	int up, left;

	up = utilv1(i - 1, j, mat);
	left = utilv1(i, j - 1, mat);

	return (up + left) % val;
    }

    // Tabulation
    static int util(int[][] mat, int[][] dp) {

	int up = 0, left = 0;

	int n = dp.length;
	int m = dp[0].length;
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {

		if (mat[i][j] == 1)
		    dp[i][j] = 0;
		else if (i == 0 && j == 0)
		    dp[i][j] = 1;
		else {
		    if (i > 0)
			up = dp[i - 1][j];

		    if (j > 0)
			left = dp[i][j - 1];

		    dp[i][j] = (up + left) % val;
		}
	    }
	}

	return dp[n - 1][m - 1];

    }

}
