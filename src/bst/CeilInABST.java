package bst;

public class CeilInABST {

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int findCeil(Node root, int key) {

	int ceil = -1;

	while (root != null) {
	    if (root.data == key)
		return key;
	    else {
		if (key > root.data)
		    root = root.right;
		else {
		    ceil = root.data;
		    root = root.left;
		}
	    }
	}

	return ceil;

    }
}
