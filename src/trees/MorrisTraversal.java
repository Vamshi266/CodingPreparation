package trees;

public class MorrisTraversal {

    public static Node getPredecessor(Node node) {
	Node prev = node.left;

	while (prev.right != null && prev.right != node)
	    prev = prev.right;

	return prev;
    }

    public static void morrisTraversal(Node node) {
	Node curr = node;

	while (curr != null) {
	    if (curr.left == null) {
		System.out.print(curr.data + " ");
		curr = curr.right;
	    } else {
		Node p = getPredecessor(node);

		if (p.right == null) {
		    p.right = curr;
		    curr = curr.left;
		} else {
		    p.right = null;
		    System.out.print(curr.data + " ");
		    curr = curr.right;
		}
	    }
	}
    }

    public static void main(String[] args) {
	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(3);

	root.left.left = new Node(4);
	root.left.right = new Node(5);
	root.left.left.right = new Node(7);

	root.right.right = new Node(6);

	morrisTraversal(root);
    }

}
