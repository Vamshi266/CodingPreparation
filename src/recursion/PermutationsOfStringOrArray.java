package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfStringOrArray {

    /* swap version start */
    public static void swap(int index, int i, int[] nums) {
	int temp = nums[index];
	nums[index] = nums[i];
	nums[i] = temp;
	return;
    }

    // number of permutations = n!
    // time complexity = O(n!) * O(n)
    // space complexity = O(1)

    public static void recurPermuate(int index, int[] nums, List<List<Integer>> ans) {
	if (index == nums.length) {
	    List<Integer> ds = new ArrayList<>();
	    for (int i = 0; i < nums.length; i++) {
		ds.add(nums[i]);
	    }
	    ans.add(new ArrayList<>(ds));
	    return;
	}

	for (int i = index; i < nums.length; i++) {
	    swap(i, index, nums);
	    recurPermuate(index + 1, nums, ans);
	    swap(i, index, nums);
	}

    }

    public static List<List<Integer>> optimal2(int[] nums) {
	List<List<Integer>> ans = new ArrayList<>();
	recurPermuate(0, nums, ans);
	return ans;
    }

    /* swap version end */

    /* loop version start */
    public static void util(int arr[], List<Integer> al, List<List<Integer>> permutations, boolean freq[]) {

	if (al.size() == arr.length) {
	    permutations.add(new ArrayList<>(al));
	    return;
	}

	for (int i = 0; i < arr.length; i++) {
	    if (!freq[i]) {
		freq[i] = true;
		al.add(arr[i]);
		util(arr, al, permutations, freq);
		al.remove(al.size() - 1);
		freq[i] = false;
	    }
	}

    }

    public static List<List<Integer>> optimal(int arr[]) {
	List<Integer> al = new ArrayList<>();
	List<List<Integer>> permutations = new ArrayList<>();
	boolean freq[] = new boolean[arr.length];

	util(arr, al, permutations, freq);

	return permutations;
    }

    /* loop version end */

    public static void main(String[] args) {

	int arr[] = { 1, 2, 3 };
	List<List<Integer>> permutations = optimal(arr);
	for (List<Integer> list : permutations) {
	    System.out.println(list);
	}
    }

}
