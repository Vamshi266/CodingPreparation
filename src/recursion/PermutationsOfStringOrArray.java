package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfStringOrArray {

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

    public static void main(String[] args) {

	int arr[] = { 1, 2, 3 };
	List<List<Integer>> permutations = optimal(arr);
	for (List<Integer> list : permutations) {
	    System.out.println(list);
	}
    }

}
