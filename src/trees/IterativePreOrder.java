package trees;

import java.util.Stack;

public class IterativePreOrder {
    public static void preOrderIterative(Node node) {
	if (node == null)
	    return;

	Stack<Node> st = new Stack<>();

	st.push(node);

	while (!st.isEmpty()) {

	    System.out.print(st.peek().data + " ");
	    Node temp = st.pop();
	    if (temp.right != null)
		st.push(temp.right);

	    if (temp.left != null)
		st.push(temp.left);
	}
    }

    public static void main(String[] args) {
	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(7);

	root.left.left = new Node(3);
	root.left.right = new Node(4);

	root.left.right.left = new Node(5);
	root.left.right.right = new Node(6);

	preOrderIterative(root);
    }
}
