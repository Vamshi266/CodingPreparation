package trees;

public class NodesAtKdistanceFromLeaves {

	 int printKDistantfromLeaf(Node root, int k)
	    {
	        int arr[] = new int[100000];
	        boolean visited[] = new boolean[100000];
	        
	        return helper(root,arr,visited,k,0,0);
	    }
	    
	    int helper(Node root,int[] arr,boolean[] visited,int k,int count,int res)
	    {
	        if(root == null)
	         return 0;
	         
	         arr[count] = root.data;
	         visited[count] = false;
	         
	         if(root.left == null && root.right == null && count - k >= 0 && visited[count-k] == false)
	         {
	            res++;
	            visited[count-k] = true;
	            return res;
	         }
	         
	         res = helper(root.left,arr,visited,k,count+1,res) + helper(root.right,arr,visited,k,count+1,res);
	    
	        return res;
	        
	    }
	
}
