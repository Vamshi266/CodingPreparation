package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalidromePartitioning {

    public static boolean isPalidrome(String str, int i, int j) {
	while (i <= j) {
	    if (str.charAt(i++) != str.charAt(j--))
		return false;
	}

	return true;
    }

    public static void util(int index, String str, List<String> al, List<List<String>> res) {
	if (index == str.length()) {
	    res.add(new ArrayList<>(al));
	    return;
	}

	for (int i = index; i < str.length(); i++) {
	    if (isPalidrome(str, index, i)) {
		al.add(str.substring(index, i + 1));
		util(i + 1, str, al, res);
		al.remove(al.size() - 1);
	    }
	}
    }

    public static List<List<String>> util(String s) {

	List<List<String>> res = new ArrayList<>();
	List<String> al = new ArrayList<>();

	util(0, s, al, res);

	return res;

    }

    public static void main(String[] args) {

	String s = "aab";
	List<List<String>> res = util(s);
	System.out.println(res);

    }

}
