package trees;

import java.util.ArrayList;

public class NodeToRootPath {

    public static boolean getPath(Node node, ArrayList<Integer> al, int x) {
	if (node == null)
	    return false;

	al.add(node.data);

	if (node.data == x)
	    return true;

	if (getPath(node.left, al, x) || getPath(node.right, al, x))
	    return true;

	al.remove(al.size() - 1);

	return false;

    }

    public static ArrayList<Integer> solve(Node node, int x) {
	ArrayList<Integer> al = new ArrayList<>();
	if (node == null)
	    return al;

	getPath(node, al, x);

	return al;

    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);

	root.right = new Node(3);

	root.left.left = new Node(4);
	root.left.right = new Node(5);

	root.left.right.left = new Node(6);
	root.left.right.right = new Node(7);

	int target = 7;

	ArrayList<Integer> res = solve(root, target);

	for (Integer i : res) {
	    System.out.print(i + " ");
	}

    }

}
