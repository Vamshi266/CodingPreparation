package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    public static ArrayList<Integer> leftView(Node root) {

	ArrayList<Integer> al = new ArrayList<>();

	if (root == null)
	    return al;

	Queue<Node> q = new LinkedList<>();
	q.offer(root);

	boolean isFirst = true;

	while (!q.isEmpty()) {
	    int n = q.size();

	    Node curr = null;
	    for (int i = 0; i < n; i++) {
		curr = q.poll();
		if (isFirst == true) {
		    al.add(curr.data);
		    isFirst = false;
		}

		if (curr.left != null)
		    q.offer(curr.left);

		if (curr.right != null)
		    q.offer(curr.right);
	    }

	    isFirst = true;
	}

	return al;

    }

    public static void main(String[] args) {
	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(3);

	root.left.left = new Node(4);
	root.left.right = new Node(5);

	ArrayList<Integer> al = leftView(root);

	System.out.println("leftView" + al);
    }
}
