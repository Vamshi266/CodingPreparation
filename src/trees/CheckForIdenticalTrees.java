package trees;

import java.util.ArrayList;
import java.util.List;

//this checks whether two trees are same or not
public class CheckForIdenticalTrees {

    public static void inOrder(Node node, List<Integer> al) {
	if (node == null)
	    return;

	inOrder(node.left, al);
	al.add(node.data);
	inOrder(node.right, al);
    }

    // Time Complexity = O(N);
    // Space Complexity = O(N);
    private static boolean isIdentical(Node root1, Node root2) {

	List<Integer> l1 = new ArrayList<>();
	List<Integer> l2 = new ArrayList<>();

	inOrder(root1, l1);
	inOrder(root2, l2);

	if (l1.size() != l2.size())
	    return false;

	for (int i = 0; i < l1.size(); i++) {
	    if (l1.get(i) != l2.get(i))
		return false;
	}

	return true;
    }

    // Time Complexity = O(N);
    // Space Complexity = O(N);
    private static boolean isIdenticalv2(Node p, Node q) {
	if (p == null || q == null)
	    return p == q;

	return (p.data == q.data) && (isIdenticalv2(p.left, q.left)) && (isIdenticalv2(p.right, q.right));
    }

    public static void main(String[] args) {
	Node root1 = new Node(1);

	root1.left = new Node(2);
	root1.right = new Node(3);

	root1.right.left = new Node(4);
	root1.right.right = new Node(5);

	Node root2 = new Node(1);

	root2.left = new Node(2);
	root2.right = new Node(3);

	root2.right.left = new Node(4);
	root2.right.right = new Node(5);

	boolean res = isIdenticalv2(root1, root2);

	if (res)
	    System.out.println("identical");
	else
	    System.out.println("not identical");

    }

}
