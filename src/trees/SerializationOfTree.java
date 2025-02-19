package trees;

import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node.

public class SerializationOfTree {

//    public static String serializeTree(Node node) {
//	if (node == null)
//	    return "";
//
//	Queue<Node> q = new LinkedList<>();
//	String res = "";
//	q.offer(node);
//
//	while (!q.isEmpty()) {
//	    Node temp = q.poll();
//
//	    res += temp.data + ",";
//
//	    if (temp.left != null)
//		q.offer(temp.left);
//	    else
//		res += "#,";
//
//	    if (temp.right != null)
//		q.offer(temp.right);
//	    else
//		res += "#,";
//
//	}
//
//	return res;

    public static String serializeTree(Node root) {
	// Check if the tree is empty
	if (root == null) {
	    return "";
	}

	// Initialize an empty string
	// to store the serialized data
	StringBuilder sb = new StringBuilder();
	// Use a queue for
	// level-order traversal
	Queue<Node> q = new LinkedList<>();
	// Start with the root node
	q.offer(root);

	// Perform level-order traversal
	while (!q.isEmpty()) {
	    // Get the front node in the queue
	    Node curNode = q.poll();

	    // Check if the current node is
	    // null and append "#" to the string
	    if (curNode == null) {
		sb.append("#,");
	    } else {
		// Append the value of the
		// current node to the string
		sb.append(curNode.data).append(",");
		// Push the left and right children
		// to the queue for further traversal
		q.offer(curNode.left);
		q.offer(curNode.right);
	    }
	}

	// Return the
	// serialized string
	return sb.toString();

    }

    public static Node deserializeTree(String res) {

	if (res.isEmpty()) {
	    return null;
	}

	StringBuilder s = new StringBuilder(res);

	// read (0,",") substring
	// and delete that part after that
	int commaIndex = s.indexOf(",");
	String str = s.substring(0, commaIndex);
	s.delete(0, commaIndex + 1);
	Node root = new Node(Integer.parseInt(str));

	Queue<Node> q = new LinkedList<>();

	q.offer(root);

	while (!q.isEmpty()) {

	    Node node = q.poll();

	    // read (0,",") substring
	    // and delete that part after that
	    commaIndex = s.indexOf(",");
	    str = s.substring(0, commaIndex);
	    s.delete(0, commaIndex + 1);

	    if (!str.equals("#")) {
		Node leftNode = new Node(Integer.parseInt(str));
		node.left = leftNode;
		q.offer(leftNode);
	    }

	    // read (0,",") substring
	    // and delete that part after that
	    commaIndex = s.indexOf(",");
	    str = s.substring(0, commaIndex);
	    s.delete(0, commaIndex + 1);

	    if (!str.equals("#")) {
		Node rightNode = new Node(Integer.parseInt(str));
		node.right = rightNode;
		q.offer(rightNode);
	    }
	}

	return root;

    }

    public static void inOrder(Node node) {
	if (node == null)
	    return;

	inOrder(node.left);
	System.out.print(node.data + " ");
	inOrder(node.right);
    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(3);

	root.left.left = new Node(4);
	root.left.right = new Node(5);

	root.right.left = new Node(6);
	root.right.right = new Node(7);

	String res = serializeTree(root);
//	System.out.println(res);

	Node head = deserializeTree(res);

	inOrder(head);
	System.out.println();
	inOrder(root);

    }
}
