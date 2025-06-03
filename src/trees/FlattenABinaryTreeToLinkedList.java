package trees;

import java.util.Stack;

public class FlattenABinaryTreeToLinkedList {

    static Node prev;

    // recursive approach
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static void util(Node root) {
	if (root == null)
	    return;

	util(root.right);
	util(root.left);

	root.right = prev;
	root.left = null;

	prev = root;
    }

    // using Stack
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static void flatten1(Node root) {
	Stack<Node> st = new Stack<>();
	st.push(root);

	while (!st.isEmpty()) {
	    Node curr = st.pop();

	    if (curr.right != null)
		st.push(curr.right);

	    if (curr.left != null)
		st.push(curr.left);

	    if (!st.isEmpty())
		curr.right = st.peek();

	    curr.left = null;
	}
    }

}
