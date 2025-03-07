package arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    // Time Complexity = O(N)
    // Space Complexity = O(N);
    public static boolean optimal(int[] arr, int k) {

	Map<Integer, Integer> hm = new HashMap<>();

	for (int i = 0; i < arr.length; i++) {
	    if (!hm.containsKey(arr[i]))
		hm.put(arr[i], i);
	    else {
		if (Math.abs(i - hm.get(arr[i])) <= k)
		    return true;
		else
		    hm.put(arr[i], i);
	    }
	}

	return false;

    }

    public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 1 };
	int k = 3;

	boolean res = optimal(arr, k);
	System.out.println("res = " + res);
    }
}
