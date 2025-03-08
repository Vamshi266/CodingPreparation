package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CombinationSum2 {

    // Time Complexity = O(2^k * k) k = value of each integer
    // Space Complexity = O(k * x) x == no of combinations
    public static void util1(int index, int arr[], int target, List<Integer> al, Set<List<Integer>> combinations) {
	if (index == arr.length) {
	    if (target == 0)
		combinations.add(new ArrayList<>(al));

	    return;
	}

	// pick element
	if (arr[index] <= target) {
	    al.add(arr[index]);
	    util1(index + 1, arr, target - arr[index], al, combinations);
	    al.remove(al.size() - 1);
	}

	// don't pick element
	util1(index + 1, arr, target, al, combinations);
    }

    public static List<List<Integer>> bruteForce(int[] arr, int target) {

	Arrays.sort(arr);
	List<Integer> al = new ArrayList<Integer>();
	Set<List<Integer>> combinations = new HashSet<>();

	util1(0, arr, target, al, combinations);

	return combinations.stream().collect(Collectors.toList());
    }

    // Time Complexity = O(2^n * k) ,k = average length of each combination
    // Space Complexity = O(k * x) ,x = no of combinations
    public static void util2(int index, int target, int arr[], List<Integer> al, List<List<Integer>> combinations) {
	if (target == 0) {
	    combinations.add(new ArrayList(al));
	    return;
	}

	for (int i = index; i < arr.length; i++) {
	    if (i > index && arr[i] == arr[i - 1])
		continue;

	    if (arr[i] > target)
		break;

	    al.add(arr[i]);
	    util2(i + 1, target - arr[i], arr, al, combinations);
	    al.remove(al.size() - 1);
	}
    }

    public static List<List<Integer>> optimal(int[] arr, int target) {

	List<List<Integer>> combinations = new ArrayList<>();
	List<Integer> al = new ArrayList<>();
	Arrays.sort(arr);

	util2(0, target, arr, al, combinations);

	return combinations;

    }

    public static void main(String[] args) {
	int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
	int target = 8;

	List<List<Integer>> res = optimal(arr, target);
	for (List<Integer> list : res) {
	    System.out.println(list);
	}

    }
}
