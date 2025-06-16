package bst;

public class ValidateBst {

    boolean isBST(Node root) {
	return validateBst(root, 0, (long) (1e9 + 1));
    }

    boolean validateBst(Node root, long minVal, long maxVal) {
	if (root == null)
	    return true;

	if (root.data <= minVal || root.data >= maxVal)
	    return false;

	// if you are going to left
	// minval = minval and maxval = root's val

	// if you are going to right
	// minval = root's val and maxval = maxval
	return validateBst(root.left, minVal, root.data) && validateBst(root.right, root.data, maxVal);
    }
}
