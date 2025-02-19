package trees;

public class CheckForBalncedBinaryTree {

    // Time Complexity = O(N^2)
    // Space Complexity = O(N)
    public static boolean checkBalance(Node node) {

	if (node == null)
	    return true;

	int lh = MaxDepthOfBinaryTree.maxDepth(node.left);
	int rh = MaxDepthOfBinaryTree.maxDepth(node.right);

	if (Math.abs(lh - rh) > 1)
	    return false;

	boolean checkLeft = checkBalance(node.left);
	boolean checkRight = checkBalance(node.right);

	if (checkLeft || checkRight)
	    return false;

	return true;

    }

    public static int checkBalancev2(Node node) {
	if (node == null)
	    return 0;

	int lh = checkBalancev2(node.left);
	int rh = checkBalancev2(node.right);

	if (lh == -1 || rh == -1)
	    return -1;

	if (Math.abs(lh - rh) > 1)
	    return -1;

	return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(3);
	root.right = new Node(2);

	root.left.left = new Node(5);
	root.left.right = new Node(4);

	root.left.left.left = new Node(7);
	root.left.left.right = new Node(6);

	boolean isBalanced = checkBalancev2(root) == -1 ? false : true;

	if (isBalanced)
	    System.out.println("balanced");
	else
	    System.out.println("not balanced");

    }

}
