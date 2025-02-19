package bst;

public class Ceil {

    public static int ceil(Node root, int key) {
	int c = -1;

	while (root != null) {
	    if (root.data == key) {
		c = root.data;
		return c;
	    }

	    if (key > root.data) {
		root = root.right;
	    } else {
		c = root.data;
		root = root.left;
	    }
	}

	return c;

    }

    public static void main(String[] args) {

	Node root = new Node(10);

	root.left = new Node(5);
	root.right = new Node(13);

	root.left.left = new Node(3);
	root.left.right = new Node(6);

	root.left.left.left = new Node(2);
	root.left.left.right = new Node(4);

	root.left.right = new Node(6);
	root.left.right.right = new Node(9);

	root.right.left = new Node(11);
	root.right.right = new Node(14);

	int res = ceil(root, 8);

	System.out.print("ceil = " + res);
    }

}
