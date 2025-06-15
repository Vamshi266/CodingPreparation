package bst;

public class KthSmallestNodeInABST {
    private int count = 0;
    private int res = -1;

    public void inOrder(Node root, int k) {
	if (root == null)
	    return;

	inOrder(root.left, k);

	count++;
	if (count == k) {
	    res = root.data;
	    return;
	}

	inOrder(root.right, k);
    }

    public int kthSmallest(Node root, int k) {
	inOrder(root, k);
	return res;
    }
}
