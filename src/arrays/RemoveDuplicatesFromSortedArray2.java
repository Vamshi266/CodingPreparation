package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int optimal(int[] arr) {

	int j = 1;
	int count = 1;
	int n = arr.length;

	for (int i = 1; i < n; i++) {
	    if (arr[i] == arr[i - 1])
		count++;
	    else
		count = 1;

	    if (count <= 2) {
		arr[j] = arr[i];
		j++;
	    }
	}

	return j;

    }

    public static void main(String[] args) {
	int arr[] = { 1, 1, 1, 2, 2, 3 };
	System.out.println(Arrays.toString(arr));
	optimal(arr);
	System.out.println(Arrays.toString(arr));

    }
}
