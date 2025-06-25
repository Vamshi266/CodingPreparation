package bst;

import java.util.Stack;

public class BSTIterator {
    private Stack<Node> st;

    public BSTIterator(Node root) {
	st = new Stack<>();
	pushLeftNodes(root);
    }

    // TimeComplexity = O(H)
    // Space Complexity = O(H)
    public void pushLeftNodes(Node root) {
	if (root == null)
	    return;

	while (root != null) {
	    st.push(root);
	    root = root.left;
	}
    }

    public int next() {
	Node node = st.pop();

	if (node.right != null)
	    pushLeftNodes(node.right);

	return node.data;
    }

    // Time Complexity = O(1)
    public boolean hasNext() {
	return !st.isEmpty();
    }
}
