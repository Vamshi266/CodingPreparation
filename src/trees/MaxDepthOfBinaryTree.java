package trees;

//(max-depth = height) for a tree
//height = log(N)
public class MaxDepthOfBinaryTree {

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int maxDepth(Node node) {

	if (node == null)
	    return 0;

	int lh = maxDepth(node.left);
	int rh = maxDepth(node.right);

	return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(3);

	root.right.left = new Node(4);
	root.right.left.left = new Node(5);
	root.right.right = new Node(6);

	int res = maxDepth(root);

	System.out.println("max-depth = " + res);

    }

}
