package circularlinkedlist;

public class InsertionInSortedList {

	public static Node insert(Node head,int data)
	{
		Node node = new Node(data);
	     Node curr = head;
	     
	      //if there are 0 elements
	     if(head == null)
	     {
	        node.next = node;
	        return node;
	     }
	     else if(data <= head.data)
	     {
	       while(curr.next != head)
	        curr = curr.next;
	        
	        curr.next = node;
	        node.next = head;
	        head = node;
	     }
	     else
	     {
	         
	         while(curr.next != head && data > curr.next.data)
	             curr = curr.next;
	             
	        node.next = curr.next;
	        curr.next = node;   
	     }
	     
	     return head;
	}
	
}
