package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderUsingIteration {

	public static List<Integer> preOrderIt(Node root)
	{
		List<Integer> preOrder = new ArrayList<>();
		if(root == null)
			return preOrder;
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			root = stack.pop();
			preOrder.add(root.data);
			if(root.right != null)
				stack.add(root.right);
			if(root.left != null)
				stack.add(root.left);
		}
		
		
		return preOrder;
	}
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		var ans = preOrderIt(root);
		
		System.out.print("pre-order : ");
		for(int i : ans)
		{
			System.out.print(i+" ");
		}
		
	}
	
}
