package trees;

public class DiameterOfaBinaryTree {

    /*
     * 
     * Diameter = longest path btw two nodes (no of edges btw them)
     * 
     */

    // Time Complexity = O(N^2)
    // Space Complexity = O(logN)
    public static void findDiameter1(Node root, int[] max) {
	if (root == null)
	    return;

	int lh = MaxDepthOfBinaryTree.maxDepth(root.left);
	int rh = MaxDepthOfBinaryTree.maxDepth(root.right);

	max[0] = Math.max(max[0], lh + rh);

	findDiameter1(root.left, max);
	findDiameter1(root.right, max);
    }

    // Time Complexity = O(N)
    // Space Complexity = O(logN)
    public static int findDiameter2(Node root, int[] max) {
	if (root == null)
	    return 0;

	int lh = findDiameter2(root.left, max);
	int rh = findDiameter2(root.right, max);

	max[0] = Math.max(max[0], lh + rh);

	return 1 + Math.max(lh, rh);

    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(3);

	root.right.left = new Node(4);
	root.right.left.left = new Node(5);
	root.right.left.left.left = new Node(6);

	root.right.right = new Node(7);
	root.right.right.right = new Node(8);
	root.right.right.right.right = new Node(9);

	int max[] = new int[1];

	findDiameter2(root, max);

	System.out.println("diameter of the tree = " + max[0]);

    }

}
