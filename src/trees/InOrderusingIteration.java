package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderusingIteration {

	public static List<Integer> inOrderIt(Node root)
	{
		
		List<Integer> inOrder = new ArrayList<>();
		Stack<Node> s = new Stack<>();
		Node node = root;
		
		while(true)
		{
			if(node != null)
			{
				s.push(node);
				node = node.left;
			}
			else
			{
				if(s.isEmpty())
					break;
				
					node = s.pop();
					inOrder.add(node.data);
					node = node.right;
				
			}
		}
		
		return inOrder;
	
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		
		var ans = inOrderIt(root);
		
		System.out.print("in-order : ");
		for(int i : ans)
		{
			System.out.print(i+" "); 
		}
	}
	
	
}
