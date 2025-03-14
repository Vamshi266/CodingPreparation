package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FourSum {

    // Time Complexity = O(N^4)
    // Space Complexity = O(1)
    public List<List<Integer>> bruteForce(int[] arr, int target) {

	Set<List<Integer>> ans = new HashSet<>();
	int n = arr.length;
	for (int i = 0; i < n; i++) {
	    for (int j = i + 1; j < n; j++) {
		for (int k = j + 1; k < n; k++) {
		    for (int l = k + 1; l < n; l++) {
			if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
			    List<Integer> al = new ArrayList<>();
			    al.add(arr[i]);
			    al.add(arr[j]);
			    al.add(arr[k]);
			    al.add(arr[l]);
			    Collections.sort(al);
			    ans.add(al);
			}
		    }
		}
	    }
	}

	List<List<Integer>> res = ans.stream().collect(Collectors.toList());
	return res;

    }

    // Time Complexity = O(N^3)
    // Space Complexity = O(N)
    public List<List<Integer>> better(int[] arr, int target) {
	Set<List<Integer>> ans = new HashSet<>();

	int n = arr.length;
	for (int i = 0; i < n; i++) {
	    for (int j = i + 1; j < n; j++) {
		Set<Integer> set = new HashSet<>();
		for (int k = j + 1; k < n; k++) {
		    int sum = target - (arr[i] + arr[j] + arr[k]);

		    // if sum is present between j and k
		    if (set.contains(sum)) {
			List<Integer> al = new ArrayList<>();
			al.add(arr[i]);
			al.add(arr[j]);
			al.add(arr[k]);
			al.add(sum);
			Collections.sort(al);
			ans.add(al);
		    }

		    // else add it to set
		    set.add(arr[k]);
		}
	    }
	}

	List<List<Integer>> res = ans.stream().collect(Collectors.toList());
	return res;
    }

    // Time Complexity = O(N^3)
    // Space Complexity = O(1)
    public static List<List<Integer>> optimal(int[] arr, int target) {

	Arrays.sort(arr);
	int n = arr.length;
	Set<List<Integer>> ans = new HashSet<>();

	// keep i constant
	for (int i = 0; i < n; i++) {
	    if (i > 0 && i < n && arr[i] == arr[i - 1])
		continue;

	    // keep j constant
	    for (int j = i + 1; j < n; j++) {
		if (j != i + 1 && arr[j] == arr[j - 1])
		    continue;

		// keep moving k and l
		// k is lowest end (left)
		// l is biggest end (right)
		int k = j + 1;
		int l = n - 1;

		// two pointer approach
		while (k < l) {
		    long sum = (long) arr[i] + (long) arr[j] + (long) arr[k] + (long) arr[l];

		    if (sum == target) {
			List<Integer> al = new ArrayList<>();
			al.add(arr[i]);
			al.add(arr[j]);
			al.add(arr[k]);
			al.add(arr[l]);
			Collections.sort(al);
			ans.add(al);
			k++;
			l--;

			// while arr[k] is same as arr[k-1] move k
			while (k < l && arr[k] == arr[k - 1])
			    k++;

			// while arr[l] is same as arr[l+1] move l
			while (k < l && arr[l] == arr[l + 1])
			    l--;
		    }
		    // if sum is less than target move k to left (lowering value)
		    else if (sum < target)
			k++;
		    // if sum is greater than target move l to right (increasing value)
		    else
			l--;
		}

	    }

	}

	List<List<Integer>> res = ans.stream().collect(Collectors.toList());
	return res;

    }

    public static void main(String[] args) {
	int arr[] = { 1, 0, -1, 0, -2, 2 };
	int target = 0;

	List<List<Integer>> res = optimal(arr, target);
	System.out.println(res);

    }

}
