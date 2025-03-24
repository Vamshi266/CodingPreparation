package sorting;

import java.util.Arrays;

public class InsertionSort {

    /*
     * 
     * go to right as long as it's increasing as you see the element less than
     * previous element put it in the correct position by comparing to previous
     * elements by going to the left
     * 
     */

    public static void insertionSort(int arr[]) {

	int n = arr.length;
	for (int i = 0; i < n; i++) {
	    int j = i;

	    while (j > 0 && arr[j - 1] > arr[j]) {
		int temp = arr[j - 1];
		arr[j - 1] = arr[j];
		arr[j] = temp;

		j--;
	    }
	}

    }

    public static void main(String[] args) {
	int arr[] = { 4, 1, 3, 9, 7 };

	System.out.println("before sorting : " + Arrays.toString(arr));
	insertionSort(arr);
	System.out.println("after  sorting : " + Arrays.toString(arr));

    }

}
