package trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializationAndDeSerializationOfBinaryTree {

    // this approach uses BFS
    public String serialize(Node root) {
	if (root == null)
	    return "null";

	StringBuilder str = new StringBuilder();
	Queue<Node> q = new LinkedList<>();
	q.offer(root);

	while (!q.isEmpty()) {
	    Node curr = q.poll();

	    // we use ',' as delimeter inorder to seperate nodes
	    if (curr == null)
		str.append("null,");
	    else {
		str.append(curr.data + ",");
		q.offer(curr.left);
		q.offer(curr.right);
	    }
	}

	return str.toString();
    }

    // Decodes your encoded data to tree.
    public Node deserialize(String data) {
	if (data == null || data.equals("null"))
	    return null;

	// get the array of strings and each string is a node
	String values[] = data.split(",");

	Node root = new Node(Integer.parseInt(values[0]));

	Queue<Node> q = new LinkedList<>();
	q.offer(root);

	int i = 1;

	while (!q.isEmpty() && i < values.length) {
	    Node curr = q.poll();

	    // if the node at i is not null then convert it to Integer and add it as left
	    // child
	    if (!values[i].equals("null")) {
		curr.left = new Node(Integer.parseInt(values[i]));
		q.offer(curr.left);
	    }

	    i++;

	    // if the node at i is not null then convert it to Integer and add it as right
	    // child
	    // we are also checking whether i exceeds values length here as we are
	    // incrementing above
	    if (i < values.length && !values[i].equals("null")) {
		curr.right = new Node(Integer.parseInt(values[i]));
		q.offer(curr.right);
	    }

	    i++;
	}

	return root;
    }

}
