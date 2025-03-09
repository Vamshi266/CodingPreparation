package recursion;

import java.util.ArrayList;

public class SubsetSums {

    // Time Complexity = O(2^N)
    // Space Complexity = stack(O(N)) + O(N)
    public static void util(int index, int arr[], int sum, ArrayList<Integer> al) {
	if (index == arr.length) {
	    al.add(sum);
	    return;
	}

	sum += arr[index];
	util(index + 1, arr, sum, al);
	sum -= arr[index];
	util(index + 1, arr, sum, al);

    }

    public static ArrayList<Integer> optimal(int[] arr) {

	ArrayList<Integer> al = new ArrayList<>();

	util(0, arr, 0, al);

	return al;

    }

    public static void main(String[] args) {
	int arr[] = { 2, 3 };

	ArrayList<Integer> al = optimal(arr);
	System.out.println(al);
    }
}
