package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {

    static class Pair {
	int hd;
	Node node;

	public Pair(int hd, Node node) {
	    this.hd = hd;
	    this.node = node;
	}

    }

    public static ArrayList<Integer> bottomView(Node node) {

	ArrayList<Integer> al = new ArrayList<>();

	if (node == null)
	    return al;

	Queue<Pair> q = new ArrayDeque<>();
	Map<Integer, Integer> tm = new TreeMap<>();

	q.offer(new Pair(0, node));

	while (!q.isEmpty()) {
	    Pair curr = q.poll();

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

	Node root = new Node(6);

	root.left = new Node(2);
	root.right = new Node(1);
	root.right.right = new Node(5);

	root.left.right = new Node(3);
	root.left.right.right = new Node(4);

	ArrayList<Integer> al = bottomView(root);

	for (Integer i : al) {
	    System.out.print(i + " ");
	}

    }
}
