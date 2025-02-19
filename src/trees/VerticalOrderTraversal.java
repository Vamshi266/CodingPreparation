package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversal {

    public static ArrayList<Integer> verticalOrderTraversal(Node node) {

	ArrayList<Integer> res = new ArrayList<>();
	if (node == null)
	    return res;

	Queue<Pair> q = new ArrayDeque<>();
	Map<Integer, ArrayList<Integer>> al = new TreeMap<>();
	q.offer(new Pair(0, node));

	while (!q.isEmpty()) {
	    Pair curr = q.poll();

	    if (al.containsKey(curr.hd)) {
		al.get(curr.hd).add(curr.node.data);
	    } else {
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(curr.node.data);
		al.put(curr.hd, temp);
	    }

	    if (curr.node.left != null)
		q.add(new Pair(curr.hd - 1, curr.node.left));

	    if (curr.node.right != null)
		q.add(new Pair(curr.hd + 1, curr.node.right));

	}

	for (Map.Entry<Integer, ArrayList<Integer>> e : al.entrySet()) {
	    res.addAll(e.getValue());
	}

	return res;
    }

    static class Pair {
	int hd;
	Node node;

	public Pair(int hd, Node node) {
	    this.hd = hd;
	    this.node = node;
	}

    }

    public static void printList(ArrayList<Integer> al) {
	for (Integer i : al)
	    System.out.print(i + " ");
    }

    public static void main(String[] args) {

	Node root = new Node(20);

	root.left = new Node(10);
	root.right = new Node(30);

	root.left.left = new Node(50);
	root.left.right = new Node(60);

	root.right.left = new Node(5);
	root.right.right = new Node(40);

	ArrayList<Integer> res = verticalOrderTraversal(root);

	printList(res);

    }

}
