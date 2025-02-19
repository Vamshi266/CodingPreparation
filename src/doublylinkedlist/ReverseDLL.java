package doublylinkedlist;

import java.util.Stack;

public class ReverseDLL {
	
	static Node head;
	
	public static void printList()
	{
		if(head == null)
		{
			System.out.println("linked list is empty");
			return;
		}
		
		Node curr = head;
		
		while(curr != null)
		{
			System.out.print(curr.data+"<=>");
			curr = curr.next;
		}
		System.out.print("null");
	}
	
	public static void createList()
	{
		Node n1 = new Node(23);
		Node n2 = new Node(24);
		Node n3 = new Node(25);
		Node n4 = new Node(26);
		Node n5 = new Node(27);
		
		head = n1;
		
		n1.prev = null;
		
		n1.next = n2;
		n2.prev = n1;
		
		n2.next = n3;
		n3.prev = n2;
		
		n3.next = n4;
		n4.prev = n3;
		
		n4.next = n5;
		n5.prev = n4;
		
		n5.next = null;
		
		head = n1;
		
		n1.prev = null;
		
		n1.next = n2;
		n2.prev = n1;
		
		n2.next = n3;
		n3.prev = n2;
		
		n3.next = n4;
		n4.prev = n3;
		
		n4.next = n5;
		n5.prev = n4;
		
		n5.next = null;
	}
	
	//Time Complexity = O(n)
	//Space complexity = O(n)
	public static void reverseDll()
	{
		Node temp = head;
		Stack<Integer> st = new Stack<>();
		
		while(temp != null)
		{
			st.push(temp.data);
			temp = temp.next;
		}
		
		temp = head;
		
		while(!st.isEmpty())
		{
			temp.data = st.pop();
			temp = temp.next;
		}
		
	}
	
	public static Node reverseDll2()
	{
		if(head == null || head.next == null)
		{
			System.out.println("List is empty");
			return head;
		}
		
		Node p = null;
		Node curr = head;
		
		while(curr != null)
		{
			p = curr.prev;
			curr.prev = curr.next;
			curr.next = p;
			
			curr = curr.prev;
		}
		
		return p.prev;
	}
	
	public static void main(String[] args) {
		
		createList();
		printList();
		System.out.println();
//		reverseDll();
		head = reverseDll2();
		printList();
	}

}
