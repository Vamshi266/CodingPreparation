package trees;

import java.util.Stack;

public class IterativePostOrderUsingSingleStack {

    public static void postOrder(Node node) {
	if (node == null)
	    return;

	Stack<Node> st = new Stack<>();

	Node curr = node;
	Node temp = null;

	while (curr != null || !st.isEmpty()) {
	    if (curr != null) {
		st.push(curr);
		curr = curr.left;
	    } else {
		temp = st.peek().right;
		if (temp == null) {
		    temp = st.pop();
		    System.out.print(temp.data + " ");
		    while (!st.isEmpty() && temp == st.peek().right) {
			temp = st.pop();
			System.out.print(temp.data + " ");
		    }
		} else
		    curr = temp;

	    }
	}

    }

    public static void main(String[] args) {
	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(7);

	root.left.left = new Node(3);

	root.left.left.right = new Node(4);
	root.left.left.right.right = new Node(5);
	root.left.left.right.right.right = new Node(6);

	root.right.left = new Node(8);

	postOrder(root);

    }

}
