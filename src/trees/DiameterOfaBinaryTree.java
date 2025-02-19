package trees;

public class DiameterOfaBinaryTree {

    static int diameter;

    public static int findDiameter(Node root) {
	if (root == null)
	    return 0;

	int lh = findDiameter(root.left);
	int rh = findDiameter(root.right);

	diameter = Math.max(diameter, lh + rh);

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

	findDiameter(root);

	System.out.println("diameter of the tree = " + diameter);

    }

}
