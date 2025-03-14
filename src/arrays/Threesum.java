package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Threesum {

    // Time Complexity = O(N^3)
    // Space Complexity = O(1)
    public static ArrayList<ArrayList<Integer>> bruteForce(int arr[]) {
	int n = arr.length;
	Set<ArrayList<Integer>> al = new HashSet<>();
	for (int i = 0; i < n; i++) {
	    for (int j = i + 1; j < n; j++) {
		for (int k = j + 1; k < n; k++) {
		    if ((arr[i] + arr[j] + arr[k]) == 0) {

			ArrayList<Integer> ts = new ArrayList<>(3);
			ts.add(arr[i]);
			ts.add(arr[j]);
			ts.add(arr[k]);
			ts.sort(null);
			al.add(ts);
		    }
		}
	    }
	}

	ArrayList<ArrayList<Integer>> ans = new ArrayList<>(al);

	return ans;

    }

    // Time Complexity = O(N^2)
    // Space Complexity = O(N)
    public static List<List<Integer>> better(int arr[]) {
	int n = arr.length;

	Set<List<Integer>> set = new HashSet();
	for (int i = 0; i < n; i++) {
	    Set<Integer> hashset = new HashSet<>();
	    for (int j = i + 1; j < n; j++) {
		int third = -(arr[i] + arr[j]);

		// between i and j there is a element that equals to variable third
		// so we found a triplet
		if (hashset.contains(third)) {
		    List<Integer> al = Arrays.asList(arr[i], arr[j], third);
		    al.sort(null);
		    set.add(al);
		}
		hashset.add(arr[j]);
	    }
	}

	List<List<Integer>> ans = new ArrayList<>(set);
	return ans;
    }

    // Time Complexity = O(NlogN)
    // Space Complexity = O(1)
    public static List<List<Integer>> optimal(int arr[]) {

	List<List<Integer>> ans = new ArrayList<>();

	Arrays.sort(arr);
	int n = arr.length;

	for (int i = 0; i < n; i++) {

	    // move i until arr[i] is same as arr[i-1]
	    if ((i > 0) && (arr[i] == arr[i - 1]))
		continue;

	    int j = i + 1;
	    int k = n - 1;

	    while (j < k) {
		int sum = arr[i] + arr[j] + arr[k];

		// move right as value is less than 0
		if (sum < 0)
		    j++;

		// move left as value is more than 0
		else if (sum > 0)
		    k--;

		// here sum = 0
		else {

		    // create triplet
		    List<Integer> al = Arrays.asList(arr[i], arr[j], arr[k]);
		    // add the triplet
		    ans.add(al);
		    j++;
		    k--;

		    // move j if j<k and arr[j] is same as arr[j-1]
		    while (j < k && arr[j] == arr[j - 1])
			j++;

		    // move k if j<k and arr[k] is same as arr[k+1]
		    while (j < k && arr[k] == arr[k + 1])
			k--;
		}
	    }

	}

	return ans;
    }

}
