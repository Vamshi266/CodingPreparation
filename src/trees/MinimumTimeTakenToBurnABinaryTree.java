package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//this problem is same as NodesAtKdistanceFromTargetNode . 
//just return the level count
public class MinimumTimeTakenToBurnABinaryTree {
    public static void parentTrac(Node root, Map<Node, Node> parentMap, Node target) {
	Queue<Node> q = new LinkedList<>();
	q.offer(root);

	while (!q.isEmpty()) {
	    int n = q.size();

	    for (int i = 0; i < n; i++) {
		Node curr = q.poll();

		if (curr.left != null) {
		    q.offer(curr.left);
		    parentMap.put(curr.left, curr);
		}

		if (curr.right != null) {
		    q.offer(curr.right);
		    parentMap.put(curr.right, curr);
		}
	    }
	}

    }

    public static int util(Node root, Node target) {
	ArrayList<Integer> al = new ArrayList<>();
	if (root == null)
	    return 0;

	Map<Node, Node> parentMap = new HashMap<>();
	parentTrac(root, parentMap, target);
	Map<Node, Boolean> visited = new HashMap<>();
	Queue<Node> q = new LinkedList<>();
	q.offer(target);
	visited.put(target, true);
	int currLevel = 0;
	while (!q.isEmpty()) {
	    int n = q.size();
	    currLevel++;
	    for (int i = 0; i < n; i++) {
		Node curr = q.poll();

		if (curr.left != null && visited.get(curr.left) == null) {
		    q.offer(curr.left);
		    visited.put(curr.left, true);
		}

		if (curr.right != null && visited.get(curr.right) == null) {
		    q.offer(curr.right);
		    visited.put(curr.right, true);
		}

		if (parentMap.get(curr) != null && visited.get(parentMap.get(curr)) == null) {
		    q.offer(parentMap.get(curr));
		    visited.put(parentMap.get(curr), true);
		}
	    }
	}

	while (!q.isEmpty()) {
	    al.add(q.poll().data);
	}

	return currLevel - 1;
    }

    public static Node findNode(Node root, int data) {
	if (root == null || root.data == data)
	    return root;

	if (root.left != null) {
	    Node res = findNode(root.left, data);
	    if (res != null)
		return res;
	}

	if (root.right != null) {
	    Node res = findNode(root.right, data);
	    if (res != null)
		return res;
	}

	return null;
    }

    public static int minTime(Node root, int target) {

	Node node = findNode(root, target);
	return util(root, node);

    }
}
