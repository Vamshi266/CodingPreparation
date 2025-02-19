package trees;



//class Node
//{
//	int data;
//	Node left;
//	Node right;
//	
//	public Node(int data)
//	{
//		this.data = data;
//	}
//}

public class BTrepresentation {
	
	//time complexity = O(n)
	//space complexity = O(n)
	public static void preOrder(Node node)
	{
		if(node == null)
			return;
		
		
		System.out.print(node.data +" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void inOrder(Node node)
	{
		if(node == null)
			return;
		
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
		
	}
	
	public static void postOrder(Node node)
	{
		if(node == null)
			return;
		
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
					
		
	}

	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		
		root.left = new Node(2);
		
		root.right = new Node(3);
		
		root.right.left = new Node(5);
		
		System.out.print("pre order : ");
		preOrder(root);
		System.out.print("\nin order : ");
		inOrder(root);
		System.out.print("\npost order : ");
		postOrder(root);
		
		
	}
	
}
