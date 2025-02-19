package trees;

import java.util.ArrayDeque;
import java.util.Deque;

//steps for level order levelOrderTraversal
//1. create a Queue
//2. add root node
//3. add root.left if it's not null
//4. add root.right if it's not null
//5. do 3,4 steps until Queue is empty

public class LevelOrderTraversal {

    // crio
    // session 8

    public static void lor(Node root) {
	Deque<Node> queue = new ArrayDeque<>();

	queue.offerLast(root);
	while (!queue.isEmpty()) {
	    Node curr = queue.pollLast();
	    System.out.print(curr.data + " ");
	    if (curr.left != null)
		queue.add(curr.left);
	    if (curr.right != null)
		queue.add(curr.right);
	}
    }

    public static void main(String[] args) {

    }

}
