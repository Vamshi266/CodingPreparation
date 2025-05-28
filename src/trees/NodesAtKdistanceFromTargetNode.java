package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class NodesAtKdistanceFromTargetNode {

    // this method fill's the parentMap
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

    public static ArrayList<Integer> distanceAtK(Node root, Node target, int k) {
	ArrayList<Integer> al = new ArrayList<>();
	if (root == null)
	    return al;

	// this map keep's trac of parent nodes
	// Map<Node,parentNode>
	Map<Node, Node> parentMap = new HashMap<>();
	// we call this method to fill the parentMap
	parentTrac(root, parentMap, target);
	// this map tells us whether a node is visited or not
	Map<Node, Boolean> visited = new HashMap<>();
	Queue<Node> q = new LinkedList<>();
	// push the target to queue
	q.offer(target);
	// mark it visited
	visited.put(target, true);
	int currLevel = 0;
	while (!q.isEmpty()) {
	    int n = q.size();
	    // when the distance reaches k break the loop
	    if (currLevel == k)
		break;
	    // we are incrementing by 1 at every level
	    currLevel++;
	    for (int i = 0; i < n; i++) {
		Node curr = q.poll();

		// if there is a left node and if it's not visited
		if (curr.left != null && visited.get(curr.left) == null) {
		    // push it
		    q.offer(curr.left);
		    // mark it true;
		    visited.put(curr.left, true);
		}

		// if there is a right node and if it's not visited
		if (curr.right != null && visited.get(curr.right) == null) {
		    // push it
		    q.offer(curr.right);
		    // mark it true;
		    visited.put(curr.right, true);
		}

		// if there is a parent node and if it's not visited
		if (parentMap.get(curr) != null && visited.get(parentMap.get(curr)) == null) {
		    // push it
		    q.offer(parentMap.get(curr));
		    // mark it true;
		    visited.put(parentMap.get(curr), true);
		}
	    }
	}

	// the nodes at distance k will only be present in queue.
	while (!q.isEmpty()) {
	    al.add(q.poll().data);
	}

	return al;
    }

    // this method return's node's reference if it's values is given
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

    public static ArrayList<Integer> KDistanceNodes(Node root, int target, int k) {

	Node node = findNode(root, target);

	ArrayList<Integer> al = distanceAtK(root, node, k);
	return al;
    }
}
