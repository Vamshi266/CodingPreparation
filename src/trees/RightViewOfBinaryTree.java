package trees;

import java.util.ArrayList;

public class RightViewOfBinaryTree {

    public static ArrayList<Integer> leftView(Node node) {
	ArrayList<Integer> al = new ArrayList<>();

	utilLeftView(node, 0, al);

	return al;

    }

    public static ArrayList<Integer> rightView(Node node) {
	ArrayList<Integer> al = new ArrayList<>();

	utilRightView(node, 0, al);

	return al;

    }

    public static void printList(ArrayList<Integer> al) {
	for (Integer i : al)
	    System.out.print(i + " ");
    }

    public static void utilLeftView(Node node, int level, ArrayList<Integer> al) {
	if (node == null)
	    return;

	if (al.size() == level)
	    al.add(node.data);

	utilLeftView(node.left, level + 1, al);
	utilLeftView(node.right, level + 1, al);

    }

    public static void utilRightView(Node node, int level, ArrayList<Integer> al) {
	if (node == null)
	    return;

	if (al.size() == level)
	    al.add(node.data);

	utilLeftView(node.right, level + 1, al);
	utilLeftView(node.left, level + 1, al);

    }

    public static void main(String[] args) {
	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(3);
	root.right.right = new Node(7);

	root.left.left = new Node(4);
	root.left.right = new Node(5);

	root.left.right.left = new Node(6);

	ArrayList<Integer> al = rightView(root);
	printList(al);

    }

}
