package bst;

import java.util.ArrayList;
import java.util.Collections;

public class InorderSuccessor {

    public static void inOrder(Node node, ArrayList<Integer> al) {
	if (node == null)
	    return;

	inOrder(node.left, al);
	al.add(node.data);
	inOrder(node.right, al);
    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static void inOrderSuccessor(Node node, int key) {

	ArrayList<Integer> al = new ArrayList<>();
	inOrder(node, al);

	int index = Collections.binarySearch(al, key);

	int n = al.size();

	if (index < n - 1)
	    System.out.println(al.get(index + 1));
	else
	    System.out.println(-1);

    }

    // Time Complexity = O(N)
    // Space Complexity = O(1)
    public static void inOrderSuccessorV2(Node node, int key) {
	int successor = 0;

	while (node != null) {
	    if (key >= node.data)
		node = node.right;
	    else {
		successor = node.data;
		node = node.left;
	    }
	}

	System.out.println("inorder successor = " + successor);

    }

    public static void main(String[] args) {
	Node root = new Node(10);

	root.left = new Node(5);
	root.right = new Node(13);

	root.left.left = new Node(3);
	root.left.right = new Node(6);

	root.left.left.left = new Node(2);
	root.left.left.right = new Node(4);

	root.left.right.right = new Node(9);

	root.right.left = new Node(11);
	root.right.right = new Node(14);

	inOrderSuccessorV2(root, 6);

    }

}
