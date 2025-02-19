package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//BFS = level order traversal
public class BFS {

    public static List<List<Integer>> levelOrderTraversal(Node root) {
	Queue<Node> queue = new LinkedList<>();
	List<List<Integer>> wrapList = new LinkedList<>();
	if (root == null)
	    return wrapList;

	queue.offer(root);

	while (!queue.isEmpty()) {
	    int levelNum = queue.size();
	    List<Integer> subList = new LinkedList<>();

	    for (int i = 0; i < levelNum; i++) {
		if (queue.peek().left != null)
		    queue.offer(queue.peek().left);
		if (queue.peek().right != null)
		    queue.offer(queue.peek().right);
		subList.add(queue.poll().data);
	    }
	    wrapList.add(subList);
	}

	return wrapList;

    }

    public static void main(String[] args) {

	Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.left.left = new Node(4);
	root.left.right = new Node(5);
	root.right.left = new Node(6);
	root.right.right = new Node(7);

	var ans = levelOrderTraversal(root);
	int level = 0;

	for (List<Integer> e : ans) {
	    System.out.print("level " + level + " : ");
	    for (int i : e) {
		System.out.print(i + " ");
	    }
	    System.out.println();
	    level++;
	}

    }

}
