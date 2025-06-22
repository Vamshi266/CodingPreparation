package bst;

import java.util.Arrays;

//the idea is to go to a node and check the bst property
//if node's val is lesser than root's val and root's left is not null go left
//else if node's val is greater than root's val and root's right is not null go right
//else check
//if node's val is less than root'val attach the node on the left
//if node's val is greater than root'val attach the node on the right
public class ConstructBSTFromPreOrder {

    private int index = 0;

    public static void insert(Node root, Node node) {
	if (root == null)
	    return;

	while (root != null) {
	    if (node.data < root.data && root.left != null) {
		root = root.left;
	    } else if (node.data > root.data && root.right != null) {
		root = root.right;
	    } else {
		if (node.data < root.data)
		    root.left = node;
		else
		    root.right = node;

		break;
	    }
	}

    }

    // Time Complexity = O(N^2)
    // Space Complexity = O(1)
    public static Node constructBST(Integer[] arr) {
	if (arr == null)
	    return null;

	int i = 0;

	Node root = null;

	while (i < arr.length) {
	    if (i == 0) {
		root = new Node(arr[i++]);
		continue;
	    }

	    Node node = new Node(arr[i]);

	    insert(root, node);

	    i++;
	}

	return root;
    }

    public static void preOrder(Node root) {
	if (root == null)
	    return;

	System.out.print(root.data + " ");
	preOrder(root.left);
	preOrder(root.right);
    }

    // there is a better approach
    // Time Compleixty = (NlogN) + (N)
    // Space Complexity = O(N)
    // we can sort the preOrder array
    // the inOrder of a Bst is always sorted so the resultant array will be inOrder
// with both preOrder and inOrder we can construct a unique Bt which will be our BST

    // optimal
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public Node Bst(int pre[], int size) {
	if (pre.length == 0 || pre == null)
	    return null;

	return constructBst(pre, Integer.MAX_VALUE);
    }

    public Node constructBst(int[] pre, int max) {
	if (index == pre.length || pre[index] > max)
	    return null;

	int data = pre[index++];
	Node root = new Node(data);
	root.left = constructBst(pre, data);
	root.right = constructBst(pre, max);

	return root;
    }

    public static void main(String[] args) {

	Integer[] arr = { 8, 5, 1, 7, 10, 12 };

	Node root = constructBST(arr);

	System.out.println(Arrays.asList(arr));
	System.out.print("preOrder : ");
	preOrder(root);

    }
}
