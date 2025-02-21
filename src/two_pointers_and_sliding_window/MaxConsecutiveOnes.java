package two_pointers_and_sliding_window;

public class MaxConsecutiveOnes {

//    Time Complexity - O(N^2)
//    Space Complexity - O(1)
    public static int bruteForce(int arr[], int k) {
	int maxLen = Integer.MIN_VALUE;
	int zeroCount = 0;
	int len = 0;

	for (int i = 0; i < arr.length; i++) {
	    zeroCount = 0;
	    for (int j = i; j < arr.length; j++) {

		if (arr[j] == 0) {
		    zeroCount++;
		}

		if (zeroCount <= k) {
		    len = j - i + 1;
		    maxLen = Math.max(len, maxLen);
		} else
		    break;

	    }
	}

	return maxLen;
    }

    public static void main(String[] args) {

	int arr[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };

	int res = bruteForce(arr, 2);

	System.out.print("maxOnes = " + res);

    }

}
