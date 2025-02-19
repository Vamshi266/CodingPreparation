package bst;

public class KthLargestOrSmallestNode {

    // approach - 1
    // Time Complexity = O(N)
    // Space Complexity = O(N)
    /*
     * public static void inOrder(Node node, ArrayList<Integer> al) { if (node ==
     * null) return;
     * 
     * inOrder(node.left, al); al.add(node.data); inOrder(node.right, al); }
     */

    /*
     * public static int kthSmallest(Node node, int k) {
     * 
     * ArrayList<Integer> al = new ArrayList<>();
     * 
     * inOrder(node, al);
     * 
     * return al.get(k - 1);
     * 
     * }
     */

    static int count = 0;
    static int kthSmallest = Integer.MIN_VALUE;
    static int kthLargest = Integer.MAX_VALUE;

    public static void inOrder(Node node, int k) {

	if (node == null || count >= k)
	    return;

	inOrder(node.left, k);

	count++;

	if (count == k) {
	    kthSmallest = node.data;
	    return;
	}

	inOrder(node.right, k);

    }

    public static void reverseInOrder(Node node, int k) {

	if (node == null || count >= k)
	    return;

	reverseInOrder(node.right, k);

	count++;

	if (count == k) {
	    kthLargest = node.data;
	    return;
	}

	reverseInOrder(node.left, k);

    }

    public static void main(String[] args) {

	Node root = new Node(5);

	root.left = new Node(3);
	root.right = new Node(7);

	root.left.left = new Node(1);
	root.left.right = new Node(4);

	root.left.left.right = new Node(2);

	root.right.left = new Node(6);
	root.right.right = new Node(8);

	int k = 2;
	inOrder(root, k);
	count = 0;
	reverseInOrder(root, k);
//	int res = kthSmallest(root, k);

	System.out.println(k + "'th smallest node = " + kthSmallest);
	System.out.println(k + "'th largest node = " + kthLargest);
    }

}
