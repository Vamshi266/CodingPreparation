package bst;

public class SearchInBST {

    // iterative
    // when we want to return whether node is present or not
    // Time Complexity = O(logN)
    // Space Complexity = O(1)
    public static boolean searchBst1(Node root, int target) {
	if (root == null)
	    return false;

	while (root != null) {
	    if (root.data == target)
		return true;

	    root = root.data < target ? root.right : root.left;
	}

	return false;
    }

    // recursive
    // Time Complexity = O(logN)
    // Space Complexity = O(logN)
    public static boolean searchBst2(Node root, int target) {
	if (root == null)
	    return false;

	if (root.data == target)
	    return true;

	if (root.data < target)
	    return searchBst2(root.right, target);
	else
	    return searchBst2(root.left, target);
    }

    // iterative
    // when we want to return node ref
    // Time Complexity = O(logN)
    // Space Complexity = O(1)
    public static Node searchNodeBst1(Node root, int target) {

	if (root == null)
	    return root;

	while (root != null && root.data != target) {
	    root = root.data < target ? root.right : root.left;
	}

	return root;
    }

    // recursive
    // Time Complexity = O(logN)
    // Space Complexity = O(logN)
    public static Node searchNodeBst2(Node root, int target) {
	if (root == null)
	    return root;

	if (root.data == target)
	    return root;

	if (root.data < target)
	    return searchNodeBst2(root.right, target);
	else
	    return searchNodeBst2(root.left, target);
    }

}
