package trees;

public class SymmetricBinaryTree {

    public static boolean isSymmetric(Node node) {
	if (node == null)
	    return true;

	return isSymmetricHelp(node.left, node.right);
    }

    public static boolean isSymmetricHelp(Node left, Node right) {
	if (left == null || right == null)
	    return left == right;

	return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(2);

	root.left.right = new Node(3);
	root.right.right = new Node(3);

	boolean res = isSymmetric(root);

	if (res)
	    System.out.print("symmetric");
	else
	    System.out.print("not symmetric");
    }

}
