package two_pointers_and_sliding_window;

public class CountNumberOfNiceSubarrays {

    public static int bruteForce(int arr[], int k) {
	int oddCount = 0;
	int count = 0;
	int n = arr.length;

	for (int i = 0; i < n; i++) {
	    oddCount = 0;
	    for (int j = i; j < n; j++) {
		if (arr[j] % 2 != 0)
		    oddCount++;

		if (oddCount == k)
		    count++;
	    }

	}

	return count;

    }

    public static int util(int arr[], int k) {
	int sum = 0;
	int count = 0;
	int n = arr.length;

	int l = 0;
	int r = 0;

	while (r < n) {

	    sum += (arr[r] % 2);

	    while (sum > k) {
		sum -= (arr[l] % 2);
		l++;
	    }
	    count += (r - l + 1);
	    r++;
	}

	return count;
    }

    public static int optimal(int arr[], int k) {
	return util(arr, k) - util(arr, k - 1);
    }

    public static void main(String[] args) {
	int arr[] = { 1, 1, 2, 1, 1 };

	int res = bruteForce(arr, 3);

	System.out.println("res = " + res);

    }

}
