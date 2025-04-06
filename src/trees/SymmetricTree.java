package trees;

public class SymmetricTree {
    public static boolean util(Node p, Node q) {
	if (p == null && q == null)
	    return true;
	else if ((p == null && q != null) || (p != null && q == null))
	    return false;
	else if (p.data != q.data)
	    return false;
	else {
	    return util(p.left, q.right) && util(p.right, q.left);
	}
    }

    public boolean isSymmetric(Node root) {
	if (root == null)
	    return true;

	return util(root.left, root.right);
    }
}
