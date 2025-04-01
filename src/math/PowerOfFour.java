package math;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {

	// approach - 1
	// if(n <= 0)
	// return false;

	// int num = 1;

	// while(true)
	// {
	// if(num * 4 == n)
	// return true;

	// if(num > n)
	// break;

	// num *= 4;
	// }

	// return false;

	// approach - 2
	// Time Complexity = O(logN)
	// Space Complexity = O(1)

	// if(n <= 0)
	// return false;

	// while(n%4 == 0)
	// n /= 4;

	// return n==1;

	// approach - 3
	// Time Complexity = O(logN) + log(x)
	// Space Complexity = O(1)

	// int x = (int) (Math.log(n) / Math.log(4));

	// return ((int)(Math.pow(4,x)) == n)

	// approach - 4
	// Time Complexity = O(1);
	// Space Complexity = O(1);

	if (n <= 0)
	    return false;

	return ((n & (n - 1)) == 0) && ((n - 1) % 3 == 0);

    }
}
