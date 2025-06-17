package bst;

public class LCAInABST {

    // TimeComplexity = O(logN)
    // SpaceComplexity = O(logN)
    // main logic is
    // 1.if both nodes are on left go left
    // 2.if both nodes are on right go right
    // 3.if they are on different sides then you found your LCA
    Node LCA(Node root, Node n1, Node n2) {
	if (root == null)
	    return null;

	int currVal = root.data;

	if (currVal < n1.data && currVal < n2.data)
	    return LCA(root.right, n1, n2);

	if (currVal > n1.data && currVal > n2.data)
	    return LCA(root.left, n1, n2);

	return root;
    }
}
