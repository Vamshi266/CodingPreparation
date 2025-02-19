package microsoft;



class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class CheckForBST {

	
	public static boolean isBst(Node root)
	{
		return checkBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	public static boolean checkBst(Node root,int low,int high)
	{
		if(root == null) return true;
		
		if(root.data >= high || root.data <= low) return false;
		
		return checkBst(root.left,low,root.data) && checkBst(root.right,root.data,high);
		
	}
	
	
}
