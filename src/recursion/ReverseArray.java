package recursion;

import java.util.Arrays;

public class ReverseArray {

    // using two variables
    // time Compleity = O(N)
    // Space Complexity = O(1)
    public static void rotateArray(int arr[], int i, int j) {
	if (i == j)
	    return;

	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;

	i++;
	j--;

	rotateArray(arr, i, j);
    }

    // using single variable
    // time Compleity = O(N)
    // Space Complexity = O(1)
    public static void rotateArray2(int arr[], int i) {
	if (i >= (arr.length / 2))
	    return;

	int temp = arr[i];
	arr[i] = arr[arr.length - i - 1];
	arr[arr.length - i - 1] = temp;

	i++;

	rotateArray2(arr, i);
    }

    public static void main(String[] args) {

	int arr[] = { 1, 2, 3, 4, 5 };

	System.out.println(Arrays.toString(arr));
	rotateArray2(arr, 0);
	System.out.println(Arrays.toString(arr));

    }

}
