package sorting;

import java.util.Arrays;

public class InsertionSort {

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
