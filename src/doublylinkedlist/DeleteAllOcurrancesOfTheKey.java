package doublylinkedlist;

public class DeleteAllOcurrancesOfTheKey {

	public static Node deleteAllOcurrances(Node head,int x)
	{
		Node curr = head;
		Node nextNode = null;
		Node prevNode = null;
		
		while(curr != null)
		{
			
			
			if(curr.data == x)
			{
				if(curr == head)
				{
					head = head.next;
				}
				prevNode = curr.prev;
				nextNode = curr.next;
				
				if(nextNode != null)
					 nextNode.prev = prevNode;
				if(prevNode != null)
					 prevNode.next = nextNode;
			}
			
			
			curr = curr.next;
		}
		
		return head;
	}
	
}
