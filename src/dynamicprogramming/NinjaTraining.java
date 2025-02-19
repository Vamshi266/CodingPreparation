package dynamicprogramming;

public class NinjaTraining {

    public static int ninjaTraining(int n, int points[][]) {

	return util(n - 1, 3, points);

    }

    // memoization
    public static int utilM(int day, int last, int points[][], int dp[][]) {

	if (dp[day][last] != -1)
	    return dp[day][last];

	if (day == 0) {
	    int maxi = 0;

	    for (int i = 0; i <= 2; i++) {
		if (i != last)
		    maxi = Math.max(maxi, points[0][i]);
	    }

	    return maxi;
	}

	int maxi = 0;

	for (int i = 0; i <= 2; i++) {
	    if (i != last) {
		int val = points[day][i] + utilM(day - 1, i, points, dp);
		maxi = Math.max(maxi, val);
	    }
	}

	return maxi;
    }

    public static int util(int day, int last, int points[][]) {

	int maxVal = 0;

	// base case
	if (day == 0) {
	    maxVal = Integer.MIN_VALUE;

	    for (int i = 0; i <= 2; i++) {
		if (i != last)
		    maxVal = Math.max(maxVal, points[0][i]);
	    }

	    return maxVal;
	}

	int score = 0;

	for (int i = 0; i <= 2; i++) {
	    if (i != last) {
		score = points[day][i] + util(day - 1, i, points);
	    }

	    maxVal = Math.max(score, maxVal);
	}

	return maxVal;
    }

}
