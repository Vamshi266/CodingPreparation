package bst;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
	this.data = data;
    }
}

public class BST {
    public static void insertNode(Node root, int key) {
	while (true) {
	    if (key <= root.data) {
		if (root.left == null) {
		    root.left = new Node(key);
		    break;
		}

		root = root.left;
	    } else {
		if (root.right == null) {
		    root.right = new Node(key);
		    break;
		}

		root = root.right;
	    }
	}
    }

    public static void preOrder(Node node) {
	if (node == null)
	    return;

	System.out.print(node.data + " ");
	preOrder(node.left);
	preOrder(node.right);
    }

    public static void main(String[] args) {
	Node root = new Node(4);

	root.right = new Node(7);

	root.left = new Node(2);

	root.left.left = new Node(1);
	root.left.right = new Node(3);

	insertNode(root, 0);
	preOrder(root);
    }
}
