package trees;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

    public static boolean util(Node node, Node target, List<Node> al) {
	if (node == null)
	    return false;

	al.add(node);

	if (node == target)
	    return true;

	if (util(node.left, target, al) || util(node.right, target, al))
	    return true;

	al.remove(al.size() - 1);
	return false;
    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public Node bruteForce(Node root, Node p, Node q) {

	List<Node> al1 = new ArrayList<>();
	List<Node> al2 = new ArrayList<>();

	util(root, p, al1);
	util(root, q, al2);

	int len = al1.size() <= al2.size() ? al1.size() : al2.size();

	Node lastSeen = null;

	for (int i = 0; i < len; i++) {
	    if (al1.get(i) != al2.get(i))
		break;

	    lastSeen = al1.get(i);
	}

	return lastSeen;
    }

    // Time Complexity = O(N)
    // Space Complexity = O(N)
    public Node optimal(Node root, Node p, Node q) {

	// if root is null or it is equal to p or it is equal to q
	// return it
	if (root == null || root == p || root == q)
	    return root;

	/// go left
	Node left = optimal(root.left, p, q);
	// go right
	Node right = optimal(root.right, p, q);

	// if we dont have p,q on left return right
	if (left == null)
	    return right;
	// if we dont have p,q on right return left
	else if (right == null)
	    return left;
	else
	    // we found both p,q nodes return the ancestor node
	    return root;

    }

}
