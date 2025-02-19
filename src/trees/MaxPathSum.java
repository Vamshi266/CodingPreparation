package trees;

public class MaxPathSum {

    static int max;

    public static int computeMaxPath(Node node) {
	if (node == null)
	    return 0;

	int lsum = Math.max(0, computeMaxPath(node.left));
	int rsum = Math.max(0, computeMaxPath(node.right));

	max = Math.max(max, lsum + rsum + node.data);

	return node.data + Math.max(lsum, rsum);
    }

    public static int maxPathSum(Node root) {

	if (root == null)
	    return 0;

	if (root.left == null && root.right == null)
	    return root.data;

	computeMaxPath(root);
	return max;

    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);

	int res = maxPathSum(root);

	System.out.println("max path sum = " + res);

    }

}
