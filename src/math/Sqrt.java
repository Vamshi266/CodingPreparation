package math;

public class Sqrt {

    // Time Complexity = O(logN)
    // Space Complexity = O(1)
    public static int optimal(int x) {
	int l = 1;
	int r = x;
	int ans = 0;

	while (l <= r) {
	    int mid = l + (r - l) / 2;
	    long midSquare = (long) mid * mid;

	    if (midSquare == x)
		return mid;
	    else if (midSquare < x) {
		ans = mid;
		l = mid + 1;
	    } else
		r = mid - 1;
	}

	return ans;

    }

    public static void main(String[] args) {

	int x = 6;
	int res = optimal(x);
	System.out.println("res = " + res);
    }

}
