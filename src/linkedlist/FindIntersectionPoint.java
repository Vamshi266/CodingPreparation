package linkedlist;

import java.util.HashMap;

public class FindIntersectionPoint {

	public static Node findIntersection(Node head1,Node head2)
	{
		if(head1 == null || head2 == null)
			return null;
		
		HashMap<Node,Integer> hm = new HashMap<>();
		Node curr = head1;
		
		while(curr != null)
		{
			hm.put(curr, hm.getOrDefault(curr,0)+1);
			curr = curr.next;
		}
		
		curr = head2;
		
		while(curr != null)
		{
			if(hm.containsKey(curr))
				return curr;
			
			curr = curr.next;
		}
		
		
		return null;
		
	}
}
