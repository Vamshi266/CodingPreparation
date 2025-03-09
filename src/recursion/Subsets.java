package recursion;

import java.util.ArrayList;
import java.util.List;

//Note
//it is same as generate all subsequences of an (array or string)
public class Subsets {
    public static void util(int index, int arr[], List<Integer> al, List<List<Integer>> subset) {
	if (index == arr.length) {
	    subset.add(al);
	    return;
	}

	al.add(arr[index]);
	util(index + 1, arr, al, subset);
	al.remove(al.size() - 1);
	util(index + 1, arr, al, subset);

    }

    public static List<List<Integer>> optimal(int arr[]) {
	List<List<Integer>> subset = new ArrayList<>();

	util(0, arr, new ArrayList<>(), subset);

	return subset;
    }
}
