package trees;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaxWidthOfaBinaryTree {

    public static int maxWidth(Node node) {
	if (node == null)
	    return 0;

	Queue<Pair> q = new ArrayDeque<>();
	q.offer(new Pair(node, 0));
	int ans = 0;

	while (!q.isEmpty()) {
	    int n = q.size();
	    int mmin = q.peek().val;
	    int first = 0;
	    int last = 0;

	    for (int i = 0; i < n; i++) {
		int curr_id = q.peek().val;
		Node curr = q.poll().node;

		if (i == 0)
		    first = curr_id;
		if (i == n - 1)
		    last = curr_id;

		if (curr.left != null)
		    q.offer(new Pair(curr.left, 2 * curr_id + 1));

		if (curr.right != null)
		    q.offer(new Pair(curr.right, 2 * curr_id + 2));
	    }

	    ans = Math.max(ans, last - first + 1);

	}

	return ans;
    }

    public static void main(String[] args) {

	Node root = new Node(1);

	root.left = new Node(3);
	root.right = new Node(2);

	root.left.left = new Node(5);
	root.left.left.left = new Node(7);

	root.right.right = new Node(4);
	root.right.right.right = new Node(6);

	int res = maxWidth(root);

	System.out.print("max width = " + res);

    }

}
