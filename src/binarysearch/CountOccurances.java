package binarysearch;

public class CountOccurances {

	static int firstOcurrance(int arr[], int k) {
		int n = arr.length;

		int low = 0;
		int high = n - 1;

		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {

				high = mid - 1;
			} else if (arr[mid] < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low;
	}

	static int lastOcurrance(int arr[], int k) {
		int n = arr.length;

		int low = 0;
		int high = n - 1;

		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {
				ans = mid;
				low = mid + 1;
			} else if (arr[mid] < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return high;
	}

	int count(int[] arr, int n, int x) {

		int first = firstOcurrance(arr, x);
		int last = lastOcurrance(arr, x);

		return last - first + 1;

	}

}
