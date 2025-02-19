package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

//it is the level order traversal in which the direction is reversed in every level
public class ZigZagTraversal {
    public static List<List<Integer>> zigZagTraversal(Node node) {
	List<List<Integer>> wrapList = new ArrayList<>();

	if (node == null)
	    return wrapList;

	Queue<Node> q = new ArrayDeque<>();

	q.offer(node);

	int num = 1;

	while (!q.isEmpty()) {
	    int n = q.size();

	    List<Integer> subList = new ArrayList<>();

	    for (int i = 0; i < n; i++) {
		Node curr = q.poll();

		subList.add(curr.data);

		if (curr.left != null)
		    q.offer(curr.left);
		if (curr.right != null)
		    q.offer(curr.right);
	    }

	    if (num % 2 == 1)
		wrapList.add(subList);
	    else {
		Collections.reverse(subList);
		wrapList.add(subList);
	    }

	    num++;

	}

	return wrapList;

    }

    public static void printList(List<List<Integer>> res) {
	for (List<Integer> list : res) {
	    for (Integer i : list) {
		System.out.print(i);
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(3);

	root.left.left = new Node(4);
	root.left.right = new Node(5);

	root.right.right = new Node(6);

	List<List<Integer>> res = zigZagTraversal(root);
	printList(res);
    }

}
