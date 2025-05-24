package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {

    static class Pair {
	int hd;
	Node node;

	public Pair(Node node, int hd) {
	    this.hd = hd;
	    this.node = node;
	}

    }

    public static ArrayList<Integer> bottomView(Node root) {

	ArrayList<Integer> al = new ArrayList<>();

	if (root == null)
	    return al;

	Queue<Pair> q = new LinkedList<>();
	TreeMap<Integer, Integer> map = new TreeMap<>();
	q.offer(new Pair(root, 0));

	while (!q.isEmpty()) {
	    Pair curr = q.poll();
	    Node node = curr.node;
	    int hd = curr.hd;

	    map.put(hd, node.data);

	    if (node.left != null)
		q.offer(new Pair(node.left, hd - 1));

	    if (node.right != null)
		q.offer(new Pair(node.right, hd + 1));
	}

	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    al.add(entry.getValue());
	}

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

	ArrayList<Integer> res = bottomView(root);

	for (Integer i : res) {
	    System.out.print(i + " ");
	}

    }

}
