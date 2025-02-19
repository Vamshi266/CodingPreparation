package math;

public class Prime {

    /*
     * 
     * time complexity = O(n) space complexity = O(1)
     * 
     */
    public static boolean checkPrime(int n) {
	if (n == 1)
	    return false;

	for (int i = 2; i < n; i++) {
	    if (n % i == 0)
		return false;
	}

	return true;
    }

    /*
     * time complexity = O(sqrt(n)) space complexity = O(1)
     * 
     */
    public static boolean checkPrime2(int n) {
	if (n == 1)
	    return false;

	if (n == 2)
	    return true;

	if (n % 2 == 0 || n % 3 == 0)
	    return false;

	for (int i = 2; i * i <= n; i++) {
	    if (n % i == 0)
		return false;
	}

	return true;
    }

    /*
     * time complexity = O(sqrt(n)) space complexity = O(1)
     * 
     */
    public static boolean checkPrime3(int n) {
	if (n == 1)
	    return false;

	if (n == 2 || n == 3)
	    return true;

	if (n % 2 == 0 || n % 3 == 0)
	    return false;

	for (int i = 5; i * i <= n; i += 6) {
	    if (n % i == 0 || n % (i + 2) == 0)
		return false;
	}

	return true;
    }

    public static void main(String[] args) {

	boolean res = checkPrime2(7);
	if (res) {
	    System.out.println("prime");
	} else {
	    System.out.println("not a prime");
	}
    }

}
