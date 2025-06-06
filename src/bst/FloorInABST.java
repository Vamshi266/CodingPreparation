package bst;

public class FloorInABST {

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static int floor(Node root, int x) {
	int floor = -1;

	while (root != null) {
	    if (root.data == x)
		return x;
	    else {
		if (x > root.data) {
		    floor = root.data;
		    root = root.right;
		} else
		    root = root.left;

	    }
	}

	return floor;
    }
}
