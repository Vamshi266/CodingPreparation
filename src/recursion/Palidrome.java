package recursion;

public class Palidrome {

    // Time Complexity = O(N)
    // Space Compleixty = O(N)
    public static boolean palidrome(String str, int i, int j) {
	if (str.length() == 0 || str.length() == 1)
	    return true;

	if (str.charAt(i) != str.charAt(j))
	    return false;

	if (i >= j)
	    return true;

	i++;
	j--;
	return palidrome(str, i, j);
    }

    // Time Complexity = O(N)
    // Space Compleixty = O(N)
    public static boolean palidrome2(String str, int i) {
	if (i > str.length() / 2)
	    return true;

	return str.charAt(i) == str.charAt(str.length() - i - 1) && palidrome2(str, i + 1);

    }

    public static boolean palidrome3(String str, int i) {

	if (i >= str.length() / 2)
	    return true;

	if (str.charAt(i) != str.charAt(str.length() - i - 1))
	    return false;

	return palidrome3(str, i + 1);

    }

    public static boolean palidrome3(String str) {
	int i = 0;
	int j = str.length() - 1;

	while (i < j) {
	    if (str.charAt(i) != str.charAt(j))
		return false;

	    i++;
	    j--;
	}

	return true;
    }

    public static void main(String[] args) {

	int arr[] = { 5, 4, 3, 2, 1 };
	// int n = arr.length;

	/*
	 * System.out.println(Arrays.toString(arr)); quickSort(arr,0,n-1);
	 * System.out.println(Arrays.toString(arr));
	 */

	// System.out.println(fibanocci(5));

	// System.out.println(factorial(4));

	String str = "aabbaa";
	System.out.println(palidrome3(str));

    }

}
