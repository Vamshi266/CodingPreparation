package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSumProblem {

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static boolean twoSum(int arr[], int target) {

	for (int i = 0; i < arr.length; i++) {
	    for (int j = i + 1; j < arr.length; j++) {

		if ((arr[i] + arr[j]) == target)
		    return true;

	    }
	}

	return false;

    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static boolean twoSum2(int arr[], int target) {
	int req = 0;

	Set<Integer> hm = new HashSet<>();

	for (int i = 0; i < arr.length; i++) {

	    req = target - arr[i];
	    if (hm.contains(req))
		return true;

	    hm.add(arr[i]);

	}

	return false;

    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static boolean optimal(int arr[], int target) {
	int left = 0;
	int right = arr.length - 1;
	int sum = 0;

	Arrays.sort(arr);

	while (left < right) {
	    sum = arr[left] + arr[right];
	    if (sum == target)
		return true;

	    if (sum < target)
		left++;
	    else
		right--;
	}

	return false;
    }

    public static void main(String[] args) {

	int arr[] = { 2, 3, 4, 1, 2, 2, 1 };
	boolean res = optimal(arr, 22);
	System.out.println("two sum available :  " + res);

    }

}
