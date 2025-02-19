package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Pair {

    Node node;
    int val;

    public Pair(Node node, int val) {
	this.node = node;
	this.val = val;
    }

}

public class AllTraversalsInSingleGo {
    public static void allTraversals(Node node) {

	Stack<Pair> st = new Stack<>();

	List<Integer> preOrder = new ArrayList<>();
	List<Integer> inOrder = new ArrayList<>();
	List<Integer> postOrder = new ArrayList<>();

	st.push(new Pair(node, 1));

	while (!st.isEmpty()) {

	    Pair p = st.peek();

	    if (p.val == 1) {
		preOrder.add(p.node.data);
		p.val++;

		if (p.node.left != null) {
		    st.push(new Pair(p.node.left, 1));
		}
	    } else if (p.val == 2) {
		inOrder.add(p.node.data);
		p.val++;

		if (p.node.right != null) {
		    st.push(new Pair(p.node.right, 1));
		}
	    } else {
		postOrder.add(p.node.data);
		st.pop();
	    }
	}

	System.out.print("preOrder = ");
	for (Integer i : preOrder) {
	    System.out.print(i + " ");
	}

	System.out.println();

	System.out.print("inOrder = ");
	for (Integer i : inOrder) {
	    System.out.print(i + " ");
	}

	System.out.println();

	System.out.print("postOrder = ");
	for (Integer i : postOrder) {
	    System.out.print(i + " ");
	}

    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(5);

	root.left.left = new Node(3);
	root.left.right = new Node(4);

	root.right.left = new Node(6);
	root.right.right = new Node(7);

	allTraversals(root);

    }
}
