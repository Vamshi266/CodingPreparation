package linkedlist;

import java.util.HashSet;
import java.util.Set;

//we can even call loop as cycle
public class DetectLoop {

	
	//Time Complexity = O(n);
	//Space Complexity = O(n);
	public static boolean hasLoop(Node head)
	{
		if(head == null)
			return false;
		
		Set<Node> hs = new HashSet<>();
		
		Node curr = head;
		
		while(curr != null)
		{
			if(hs.contains(curr))
				return true;
			else
				hs.add(curr);
			
			curr = curr.next;
		}
		
		return false;
		
	}
	
	public static Node createList()
	{
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
//		n8.next = n9;
//		n9.next = n3;
		
		return n1;
		
	}
	
	
	//Time Complexity = O(n)
	//Space Complexity = O(1)
	public static boolean hasLoop2(Node head)
	{
		
		if(head == null)
			return false;
		
		if(head.next == head)
			return true;
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
				return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		Node head = createList();
		boolean res = hasLoop2(head);
		System.out.println(res);
		
	}
	
}
