package bst;

public class KthLargestNodeInABST {
    private int count = 0;
    private int res = -1;

    public void reverseInOrder(Node root, int k) {
	if (root == null)
	    return;

	reverseInOrder(root.right, k);

	count++;
	if (count == k) {
	    res = root.data;
	    return;
	}

	reverseInOrder(root.left, k);
    }

    public int kthLargest(Node root, int k) {

	reverseInOrder(root, k);
	return res;

    }
}
