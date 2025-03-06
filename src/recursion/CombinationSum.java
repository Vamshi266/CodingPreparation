package recursion;

import java.util.ArrayList;
import java.util.List;

//Time Complexity = O(2^k * k) k = value of each integer
//Space Complexity = O(k * x) x == no of combinations
public class CombinationSum {

    public static void util(int index, int arr[], int target, List<Integer> al, List<List<Integer>> combinations) {
	if (index == arr.length) {
	    if (target == 0)
		combinations.add(new ArrayList<>(al));

	    return;
	}

	if (arr[index] <= target) {
	    al.add(arr[index]);
	    util(index, arr, target - arr[index], al, combinations);
	    al.remove(al.size() - 1);
	}

	util(index + 1, arr, target, al, combinations);
    }

    public static List<List<Integer>> combinationSum(int[] arr, int target) {

	List<Integer> al = new ArrayList<Integer>();
	List<List<Integer>> combinations = new ArrayList<>();
	util(0, arr, target, al, combinations);

	return combinations;

    }

    public static void main(String[] args) {

	int arr[] = { 2, 3, 6, 7 };
	int target = 7;

	List<List<Integer>> combinations = combinationSum(arr, target);

	for (List<Integer> list : combinations) {
	    System.out.println(list);
	}
    }
}
