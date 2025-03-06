package arrays;

import java.util.Arrays;

//Time Complexity = O(N)
//Space Complexity = O(1)
public class RemoveDuplicatesFromSortedArray1 {

    public static int optimal(int arr[]) {
	int j = 1;
	// int count = 0;

	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] != arr[i - 1]) {

		arr[j] = arr[i];
		j++;
	    }

	}

	return j;
    }

    public static void main(String[] args) {
	int arr[] = { 2, 2, 2, 2, 2 };
	System.out.println(Arrays.toString(arr));
	optimal(arr);
	System.out.println(Arrays.toString(arr));
    }

}
