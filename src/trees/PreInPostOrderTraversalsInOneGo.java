package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {

    Node node;
    int num;

    public TreeNode(Node node, int num) {
	this.node = node;
	this.num = num;
    }

}

public class PreInPostOrderTraversalsInOneGo {

    public static void allTraversals(Node node) {
	if (node == null)
	    return;

	Stack<TreeNode> st = new Stack<>();
	st.push(new TreeNode(node, 1));

	List<Integer> preOrder = new ArrayList<>();
	List<Integer> inOrder = new ArrayList<>();
	List<Integer> postOrder = new ArrayList<>();

	while (!st.isEmpty()) {
	    if (st.peek().num == 1) {
		preOrder.add(st.peek().node.data);
		st.peek().num++;
		if (st.peek().node.left != null) {
		    st.push(new TreeNode(st.peek().node.left, 1));
		}
	    } else if (st.peek().num == 2) {
		inOrder.add(st.peek().node.data);
		st.peek().num++;
		if (st.peek().node.right != null) {
		    st.push(new TreeNode(st.peek().node.right, 1));
		}

	    } else if (st.peek().num == 3) {
		postOrder.add(st.peek().node.data);
		st.pop();
	    }
	}

	System.out.println("preOrder : " + preOrder);
	System.out.println("inOrder : " + inOrder);
	System.out.println("postOrder : " + postOrder);
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
