package trees;

public class ChildSumProperty {

    // child sum property implies (root.data = root.left.data + root.right.data)
    // making a Binary Tree to a valid "child sum property" Binary Tree"
    public static void changeTree(Node root) {
	if (root == null)
	    return;
	int sum = 0;

	// add left node val
	if (root.left != null)
	    sum += root.left.data;

	// add right node val
	if (root.right != null)
	    sum += root.right.data;

	// if sum >= root.val make the sum as root.val
	// else make the left node and right node val's to sum
	if (sum >= root.data)
	    root.data = sum;
	else {
	    if (root.left != null)
		root.left.data = sum;

	    if (root.right != null)
		root.right.data = sum;
	}

	// go left
	changeTree(root.left);
	// go right
	changeTree(root.right);

	int total = 0;
	// if there is left add the node val
	if (root.left != null)
	    total += root.left.data;

	// if there is right add the node val
	if (root.right != null)
	    total += root.right.data;

	// if any of them is not null make the root as that node's val
	if (root.left != null || root.right != null)
	    root.data = total;
    }

    // checking the tree whether is obey's child sum property
    public static int isSumProperty(Node root) {

	if (root == null)
	    return 1;

	if (root.left == null && root.right == null)
	    return 1;

	int sum = 0;
	if (root.left != null)
	    sum += root.left.data;

	if (root.right != null)
	    sum += root.right.data;

	if (sum == root.data) {
	    if (isSumProperty(root.left) == 0 || isSumProperty(root.right) == 0)
		return 0;
	    else
		return 1;
	}

	return 0;
    }

    public static void main(String[] args) {
	Node root = new Node(35);

	root.left = new Node(20);
	root.right = new Node(15);

	root.left.left = new Node(15);
	root.left.right = new Node(5);

	root.left.left.left = new Node(5);
	root.left.left.right = new Node(10);

	boolean res = (isSumProperty(root) == 1) ? true : false;

	System.out.println("child sum property  = " + res);

    }

}
