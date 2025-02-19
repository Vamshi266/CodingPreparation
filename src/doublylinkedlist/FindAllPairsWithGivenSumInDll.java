package doublylinkedlist;

import java.util.ArrayList;

public class FindAllPairsWithGivenSumInDll {
	
	
	//Time Compleixty = O(n^2)
	//Space Complexity = O(1)
	public static ArrayList<ArrayList<Integer>> twoSumDll(Node head,int target)
	{
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        
	      Node temp1 = head;
	       
	      while(temp1 != null)
	      {
	          Node temp2 = temp1.next;
	           
	          while(temp2 != null && temp1.data + temp2.data <= target)
	          {
	              if(temp1.data + temp2.data == target)
	              {
	                  ArrayList<Integer> list = new ArrayList<>();
	                  list.add(temp1.data);
	                  list.add(temp2.data);
	                  al.add(list);
	              }
	               
	              temp2 = temp2.next;
	          }
	           
	          temp1 = temp1.next;
	      }
	      
	      return al;
	}
	
	 //Time Complexity = O(n)
	 //Space Complexity = O(1)
	 public static ArrayList<ArrayList<Integer>> twoSumDll2(int target, Node head) {
	       ArrayList<ArrayList<Integer>> al = new ArrayList<>();
	       
	       Node left = head;
	       
	       while(left.next != null)
	       {
	           left = left.next;
	       }
	       
	       Node right = left;
	       left = head;
	       
	     while(left.data < right.data)
	     {
	         int sum = left.data + right.data;
	         
	         if(sum == target)
	          {
	              ArrayList<Integer> list = new ArrayList<>();
	              list.add(left.data);
	              list.add(right.data);
	              al.add(list);
	              left = left.next;
	              right = right.prev;
	          }
	          else if(sum < target)
	          {
	              left = left.next;
	          }
	          else
	          {
	              right = right.prev;
	          }
	     }
	       
	      return al;
	    }

}
