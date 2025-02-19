package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBinaryTree {

    static class Pair {
	int hd;
	Node node;

	public Pair(int hd, Node node) {
	    this.hd = hd;
	    this.node = node;
	}

    }

    public static ArrayList<Integer> topView(Node node) {

	ArrayList<Integer> al = new ArrayList<>();

	if (node == null)
	    return al;

	Queue<Pair> q = new ArrayDeque<>();
	Map<Integer, Integer> tm = new TreeMap<>();

	q.offer(new Pair(0, node));

	while (!q.isEmpty()) {
	    Pair curr = q.poll();

	    if (!tm.containsKey(curr.hd))
		tm.put(curr.hd, curr.node.data);

	    if (curr.node.left != null)
		q.offer(new Pair(curr.hd - 1, curr.node.left));

	    if (curr.node.right != null)
		q.offer(new Pair(curr.hd + 1, curr.node.right));

	}

	al.addAll(tm.values());

	return al;

    }

    public static void main(String[] args) {

	Node root = new Node(7);

	root.left = new Node(6);
	root.right = new Node(2);

	root.left.left = new Node(5);
	root.left.right = new Node(1);
	root.left.right.left = new Node(4);

	root.right.left = new Node(8);
	root.right.right = new Node(3);

	ArrayList<Integer> res = topView(root);

	for (Integer i : res) {
	    System.out.print(i + " ");
	}

    }

}
