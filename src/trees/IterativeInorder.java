package trees;

import java.util.Stack;

public class IterativeInorder {
    public static void inOrderIterative(Node node) {
	if (node == null)
	    return;

	Stack<Node> st = new Stack<>();

	while (true) {

	    if (node != null) {
		st.push(node);
		node = node.left;
	    } else {
		if (st.isEmpty())
		    break;

		node = st.pop();
		System.out.print(node.data + " ");
		node = node.right;

	    }
	}
    }
}
