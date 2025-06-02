package trees;

import java.util.ArrayList;

public class MorrisPreOrderTraversal {

    /*
     * this is exactly same as MorrisInOrderTraversal we are just adding the node
     * while creating the link
     * 
     */
    public static ArrayList<Integer> morrisPreorderTraversal(Node root) {
	ArrayList<Integer> al = new ArrayList<>();

	if (root == null)
	    return al;

	Node curr = root;

	while (curr != null) {
	    if (curr.left == null) {
		al.add(curr.data);
		curr = curr.right;
	    } else {
		Node prev = curr.left;

		while (prev.right != null && prev.right != curr)
		    prev = prev.right;

		if (prev.right == null) {
		    prev.right = curr;
		    // this one line is the only change for preOrder Traversal
		    // when compared to inOrder Traversal
		    al.add(curr.data);
		    curr = curr.left;
		} else {
		    prev.right = null;
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

	ArrayList<Integer> al = morrisPreorderTraversal(root);

	System.out.print(al);
    }
}
