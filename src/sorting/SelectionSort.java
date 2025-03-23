package sorting;

import java.util.Arrays;

public class SelectionSort {

    /*
     * overall idea select the min element and swap it with current index element
     * 
     */

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static void selectionSort(int[] arr) {

	int n = arr.length;

	for (int i = 0; i < n - 1; i++) {
	    int index = i;

	    for (int j = i + 1; j < n; j++) {
		if (arr[j] < arr[index])
		    index = j;
	    }

	    int temp = arr[i];
	    arr[i] = arr[index];
	    arr[index] = temp;
	}
    }

    public static void main(String[] args) {
	int arr[] = { 4, 1, 3, 9, 7 };

	System.out.println("before sorting : " + Arrays.toString(arr));
	selectionSort(arr);
	System.out.println("after  sorting : " + Arrays.toString(arr));

    }

}
