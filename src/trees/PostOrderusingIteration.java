package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderusingIteration {

	
	//time complexity - O(n)
	//space complexity - O(2n)
	public static List<Integer> postOrderIt(Node root)
	{
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		List<Integer> postOrder = new ArrayList<>();
		
		
		if(root == null)
			return postOrder;
		
		
		s1.push(root);
		while(!s1.isEmpty())
		{
			root = s1.pop();
			s2.add(root);
			if(root.left != null) s1.add(root.left);
			if(root.right != null) s1.add(root.right);
		}
		
		while(!s2.isEmpty())
		{
			postOrder.add(s2.pop().data);
		}
		
		return postOrder;
		
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		var ans = postOrderIt(root);
		
		System.out.print("post-order : ");
		for(int i : ans)
		{
			System.out.print(i+" ");
		}
		
		
	}
	
	
}
