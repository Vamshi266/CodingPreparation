package trees;

import java.util.ArrayList;
import java.util.List;

public class RootToLeavesPaths {

    // gfg version
    public static void util1(Node root, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> al) {

	if (root == null)
	    return;

	if (root.left == null && root.right == null) {
	    list.add(root.data);
	    al.add(new ArrayList<>(list));
	    list.remove(list.size() - 1);
	    return;
	}

	list.add(root.data);
	util1(root.left, list, al);
	util1(root.right, list, al);
	list.remove(list.size() - 1);

    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {

	ArrayList<Integer> list = new ArrayList<>();
	ArrayList<ArrayList<Integer>> al = new ArrayList<>();

	util1(root, list, al);

	return al;
    }

    // leetcode version
    public static void util2(Node root, StringBuilder str, ArrayList<String> al) {
	if (root == null)
	    return;

	int len = str.length();
	str.append(root.data);

	if (root.left == null && root.right == null)
	    al.add(str.toString());
	else {
	    str.append("->");
	    util2(root.left, str, al);
	    util2(root.right, str, al);
	}

	str.setLength(len);

    }

    public List<String> binaryTreePaths(Node root) {
	ArrayList<String> al = new ArrayList<>();

	if (root == null)
	    return al;

	StringBuilder str = new StringBuilder();

	util2(root, str, al);

	return al;

    }
}
