package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueBinaryString {
    public static boolean util1(int index, int n, Set<String> set, StringBuilder str) {
	if (index == n) {
	    if (!set.contains(str.toString()))
		return true;
	    return false;
	}

	str.append("0");
	if (util1(index + 1, n, set, str) == true)
	    return true;
	str.deleteCharAt(str.length() - 1);
	str.append("1");
	if (util1(index + 1, n, set, str) == true)
	    return true;
	str.deleteCharAt(str.length() - 1);

	return false;
    }

    public static void util2(int index, int n, List<String> al, StringBuilder str) {
	if (index == n) {
	    al.add(str.toString());
	    return;
	}

	str.append("0");
	util2(index + 1, n, al, str);
	str.deleteCharAt(str.length() - 1);
	str.append("1");
	util2(index + 1, n, al, str);
	str.deleteCharAt(str.length() - 1);

    }

    public static String optimal(String[] nums) {
	StringBuilder str = new StringBuilder();
	Set<String> set = new HashSet<>();
	for (String s : nums)
	    set.add(s);

	boolean res = util1(0, nums.length, set, str);

	if (res == true)
	    return str.toString();

	return "";

    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static String optimal2(String nums[]) {
	StringBuilder str = new StringBuilder();
	int n = nums.length;
	for (int i = 0; i < n; i++) {
	    char ch = nums[i].charAt(i) == '0' ? '1' : '0';
	    str.append(ch);
	}

	return str.toString();

    }

    // Time Complexity = O(2^N)
    // Space Complexity = O(N)
    public static String bruteForce(String[] nums) {
	StringBuilder str = new StringBuilder();
	Set<String> set = new HashSet<>();
	List<String> al = new ArrayList<>();
	for (String s : nums)
	    set.add(s);

	util2(0, nums.length, al, str);

	for (String s : al)
	    if (!set.contains(s))
		return s;

	return "";
    }
}
