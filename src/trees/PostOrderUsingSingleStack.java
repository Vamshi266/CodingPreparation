package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderUsingSingleStack {
    public static List<Integer> postOrder(Node node) {

	List<Integer> al = new ArrayList<>();

	Stack<Node> st = new Stack<>();

	Node curr = node;

	while (curr != null || !st.isEmpty()) {
	    if (curr != null) {
		st.push(curr);
		curr = curr.left;
	    } else {
		Node temp = st.peek().right;
		if (temp == null) {
		    temp = st.pop();
		    al.add(temp.data);

		    while (!st.isEmpty() && temp == st.peek().right) {
			temp = st.pop();
			al.add(temp.data);
		    }
		} else {
		    curr = temp;
		}
	    }
	}

	return al;

    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(2);
	root.right = new Node(7);

	root.right.left = new Node(8);

	root.left.left = new Node(3);
	root.left.left.right = new Node(4);
	root.left.left.right.right = new Node(5);
	root.left.left.right.right.right = new Node(6);

	List<Integer> res = postOrder(root);

	for (Integer i : res) {
	    System.out.print(i + " ");
	}

    }

}
