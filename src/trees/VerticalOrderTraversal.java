package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class Tuple {
    Node node;
    int row;
    int col;

    public Tuple(Node node, int row, int col) {
	this.node = node;
	this.row = row;
	this.col = col;
    }
}

class Pair1 {
    int hd;
    Node node;

    public Pair1(int hd, Node node) {
	this.hd = hd;
	this.node = node;
    }

}

public class VerticalOrderTraversal {

    // gfg version
    // video = https://www.youtube.com/watch?v=h7xALnzllec&t=162s
    public static ArrayList<Integer> verticalOrderTraversal(Node node) {

	ArrayList<Integer> res = new ArrayList<>();
	if (node == null)
	    return res;

	Queue<Pair1> q = new ArrayDeque<>();
	Map<Integer, ArrayList<Integer>> al = new TreeMap<>();
	q.offer(new Pair1(0, node));

	while (!q.isEmpty()) {
	    Pair1 curr = q.poll();

	    if (al.containsKey(curr.hd)) {
		al.get(curr.hd).add(curr.node.data);
	    } else {
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(curr.node.data);
		al.put(curr.hd, temp);
	    }

	    if (curr.node.left != null)
		q.add(new Pair1(curr.hd - 1, curr.node.left));

	    if (curr.node.right != null)
		q.add(new Pair1(curr.hd + 1, curr.node.right));

	}

	for (Map.Entry<Integer, ArrayList<Integer>> e : al.entrySet()) {
	    res.addAll(e.getValue());
	}

	return res;
    }

    public static void printList(ArrayList<Integer> al) {
	for (Integer i : al)
	    System.out.print(i + " ");
    }

    // leetcode version
    public List<List<Integer>> verticalTraversal(Node root) {

	List<List<Integer>> al = new ArrayList<>();

	if (root == null)
	    return al;

	Queue<Tuple> q = new LinkedList<>();

	TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

	q.add(new Tuple(root, 0, 0));

	while (!q.isEmpty()) {
	    Tuple curr = q.poll();
	    Node node = curr.node;
	    int x = curr.row;
	    int y = curr.col;

	    if (!map.containsKey(x))
		map.put(x, new TreeMap<>());

	    if (!map.get(x).containsKey(y))
		map.get(x).put(y, new PriorityQueue<>());

	    map.get(x).get(y).offer(node.data);

	    if (node.left != null)
		q.offer(new Tuple(node.left, x - 1, y + 1));

	    if (node.right != null)
		q.offer(new Tuple(node.right, x + 1, y + 1));

	}

	for (TreeMap<Integer, PriorityQueue<Integer>> levelMap : map.values()) {
	    al.add(new ArrayList<>());

	    for (PriorityQueue<Integer> nodes : levelMap.values()) {
		while (!nodes.isEmpty()) {
		    al.get(al.size() - 1).add(nodes.poll());
		}
	    }
	}

	return al;

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
