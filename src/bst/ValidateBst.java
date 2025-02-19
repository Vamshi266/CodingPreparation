package bst;

public class ValidateBst {

    public static boolean validateBst(Node node, int minVal, int maxVal) {
	if (node == null)
	    return true;

	if (node.data <= minVal || node.data >= maxVal)
	    return false;

	return validateBst(node.left, minVal, node.data) && validateBst(node.right, node.data, maxVal);
    }

    public static void main(String[] args) {

	Node root = new Node(13);

	root.left = new Node(10);
	root.right = new Node(15);

	root.left.left = new Node(7);
	root.left.right = new Node(12);

	root.left.left.right = new Node(9);
	root.left.left.right.left = new Node(8);

	root.right.left = new Node(14);
	root.right.right = new Node(16);

	root.right.right.left = new Node(18);

	System.out.print("valid binarySearchTree : " + validateBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

    }

}
