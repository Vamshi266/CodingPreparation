package bst;

public class DeleteNodeInABST {

    // Time Complexity = O(logN)
    // Space Complexity = O(logN)
    public static Node deleteNode(Node root, int key) {

	if (root == null)
	    return null;

	// go left as the val < root's value
	if (key < root.data) {
	    root.left = deleteNode(root.left, key);
	}
	// go right as the val > root's value
	else if (key > root.data) {
	    root.right = deleteNode(root.right, key);
	}
	// we found the node
	else {
	    // if the target node has 0 or one child
	    if (root.left == null)
		return root.right;
	    if (root.right == null)
		return root.left;

	    // if it has 2 child nodes

	    // take the right node
	    Node leftMostNode = root.right;

	    // go the the left most node from above node
	    while (leftMostNode.left != null)
		leftMostNode = leftMostNode.left;

	    // copy the data to root
	    root.data = leftMostNode.data;
	    // then delete that node
	    root.right = deleteNode(root.right, leftMostNode.data);
	}

	return root;

    }
}
