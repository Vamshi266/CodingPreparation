package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//boundary traversal = left boundary + leaf nodes + right boundary;

public class BoundaryTraversal {

    public static boolean isLeaf(Node node) {
	if (node.left == null && node.right == null)
	    return true;

	return false;
    }

    public static void leftBoundary(Node node, List<Integer> al) {
	Node curr = node.left;

	while (curr != null) {
	    if (isLeaf(curr) == false)
		al.add(curr.data);
	    if (curr.left != null)
		curr = curr.left;
	    else
		curr = curr.right;
	}
    }

    public static void rightBoundary(Node node, List<Integer> al) {
	Node curr = node.right;

	List<Integer> temp = new ArrayList<>();

	while (curr != null) {
	    if (isLeaf(curr) == false)
		temp.add(curr.data);
	    if (curr.right != null)
		curr = curr.right;
	    else
		curr = curr.left;
	}

	Collections.reverse(temp);
	al.addAll(temp);
    }

    public static void leafTraversal(Node node, List<Integer> al) {
	if (isLeaf(node) == true) {
	    al.add(node.data);
	    return;
	}

	if (node.left != null)
	    leafTraversal(node.left, al);
	if (node.right != null)
	    leafTraversal(node.right, al);

    }

    public static List<Integer> printBoundary(Node node) {
	if (node == null)
	    System.out.println("tree is empty");

	List<Integer> al = new ArrayList<>();

	if (isLeaf(node) == false)
	    al.add(node.data);
	leftBoundary(node, al);
	leafTraversal(node, al);
	rightBoundary(node, al);

	return al;
    }

    public static void printList(List<Integer> al) {
	for (Integer i : al) {
	    System.out.print(i + " ");
	}
    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(7);

	root.left.left = new Node(3);
	root.left.left.right = new Node(4);
	root.left.left.right.left = new Node(5);
	root.left.left.right.right = new Node(6);

	root.right.right = new Node(8);
	root.right.right.left = new Node(9);
	root.right.right.left.left = new Node(10);
	root.right.right.left.right = new Node(11);

	List<Integer> al = printBoundary(root);
	printList(al);

    }

}
