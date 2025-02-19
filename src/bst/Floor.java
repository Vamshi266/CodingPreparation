package bst;

public class Floor {

    public static int floor(Node root, int key) {
	int f = -1;

	while (root != null) {

	    if (key == root.data) {
		f = key;
		return f;
	    }

	    if (key > root.data) {
		f = root.data;
		root = root.right;
	    } else
		root = root.left;
	}

	return f;
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

	int res = floor(root, 8);

	System.out.print("floor = " + res);
    }

}
