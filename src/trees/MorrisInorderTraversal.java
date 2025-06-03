package trees;

import java.util.ArrayList;

public class MorrisInorderTraversal {

    public static ArrayList<Integer> morrisInorderTraversal(Node root) {
	ArrayList<Integer> al = new ArrayList<>();

	if (root == null)
	    return al;

	// create reference
	Node curr = root;

	// traverse until all nodes are finished
	while (curr != null) {

	    // if there is no left node
	    // add it to list
	    // move right
	    if (curr.left == null) {
		al.add(curr.data);
		curr = curr.right;
	    }
	    // if there is a left node
	    else {

		// take the curr.left ref
		Node prev = curr.left;

		// move to right most node in left subtree
		while (prev.right != null && prev.right != curr)
		    prev = prev.right;

		// if there is no link
		// create the link to root node
		if (prev.right == null) {
		    prev.right = curr;
		    curr = curr.left;
		}
		// if there is a link
		// make it null
		// add the root value to list
		// move right
		else {
		    prev.right = null;
		    al.add(curr.data);
		    curr = curr.right;
		}
	    }
	}

	return al;
    }

    public static void main(String[] args) {
	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(3);

	root.left.left = new Node(4);
	root.left.right = new Node(5);

	root.left.right.right = new Node(6);

	ArrayList<Integer> al = morrisInorderTraversal(root);

	System.out.print(al);
    }

}
