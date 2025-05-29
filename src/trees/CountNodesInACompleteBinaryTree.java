package trees;

public class CountNodesInACompleteBinaryTree {

    // go as left as possible
    // return the height
    public static int getLeftHeight(Node root) {
	int count = 0;

	while (root != null) {
	    root = root.left;
	    count++;
	}

	return count;
    }

    // go as right as possible
    // return the height
    public static int getRightHeight(Node root) {
	int count = 0;

	while (root != null) {
	    root = root.right;
	    count++;
	}

	return count;
    }

    public static int countNodes(Node root) {

	if (root == null)
	    return 0;

	int lh = getLeftHeight(root.left);
	int rh = getRightHeight(root.right);

	// if lh == rh then it's a full binary tree
	// so will have (2^lh - 1) nodes
	if (lh == rh)
	    return (2 << lh) - 1;

	// else recusively traverse left and right subtrees
	return 1 + countNodes(root.left) + countNodes(root.right);

    }

}
