package trees;

public class CheckBalancedBinaryTree {

    // Time Complexity = O(N^2)
    // Space Complexity = O(N)
    public static boolean isBalanced(Node root) {
	if (root == null)
	    return true;

	int l = MaxDepthOfBinaryTree.maxDepth(root.left);
	int r = MaxDepthOfBinaryTree.maxDepth(root.right);

	if (Math.abs(l - r) > 1)
	    return false;

	return isBalanced(root.left) && isBalanced(root.right);
    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public static int check(Node root) {
	if (root == null)
	    return 0;

	// go left
	int l = check(root.left);
	// if we have a unbalanced tree on left return -1
	if (l == -1)
	    return -1;

	// go right
	int r = check(root.right);
	// if we have a unbalanced tree on right return -1
	if (r == -1)
	    return -1;

	// if the abs difference btw leftSubTree height and rightSubTree height is > 1
	// then
	// it's unbalanced
	if (Math.abs(l - r) > 1)
	    return -1;

	return Math.max(l, r) + 1;
    }

    public static void main(String[] args) {
	Node root = new Node(1);

	root.left = new Node(3);
	root.right = new Node(2);

	root.left.left = new Node(5);
	root.left.right = new Node(4);

	root.left.left.left = new Node(7);
	root.left.left.right = new Node(6);

	int res = check(root);

	boolean balanced = res == -1 ? false : true;

	System.out.println("balanced : " + balanced);
    }

}
