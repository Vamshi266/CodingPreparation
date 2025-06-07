package bst;

public class InsertANodeInABST {

    // recursive
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static void util(Node root, int data) {
	if (root == null)
	    return;

	if (root.data < data) {
	    if (root.right != null) {
		root = root.right;
		util(root, data);
	    } else
		root.right = new Node(data);
	} else {
	    if (root.left != null) {
		root = root.left;
		util(root, data);
	    } else
		root.left = new Node(data);
	}
    }

    // part of recursive code
    public Node insertIntoBST1(Node root, int data) {
	if (root == null)
	    return new Node(data);

	Node curr = root;

	util(curr, data);

	return root;
    }

    // iterative
    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static Node insertIntoBST2(Node root, int data) {
	if (root == null)
	    return new Node(data);

	Node curr = root;
	while (curr != null) {
	    if (curr.data < data) {
		if (curr.right != null) {
		    curr = curr.right;
		} else {
		    curr.right = new Node(data);
		    break;
		}
	    } else {
		if (curr.left != null) {
		    curr = curr.left;
		} else {
		    curr.left = new Node(data);
		    break;
		}
	    }
	}

	return root;

    }

}
