package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class GroupEvenOddIndexNodes {
	
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
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static void createList()
	{
		
		Node n1 = new Node(1);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(2);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		
		head = n1;
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
	}
	
	
	//Time Complexity = O(n)
	//Space Complexity = O(1)
	public static Node groupEvenOddNodes2()
	{
		if(head == null || head.next == null)
			return head;
		
		Node evenHead = head.next;
		Node odd = head;
		Node even = head.next;
		
		while(even != null && even.next != null)
		{
			even.next = even.next.next;
			even = even.next;
			
			even = even.next;
			odd = odd.next;
		}
		
		odd.next = evenHead;
		
		return odd;
		
		
	}
	
	
	//Time Complexity = O(n)
	//Space Complexity = O(1)
	public static Node groupEvenOddNodes() 
	{
		if(head == null || head.next == null)
			return head;
		
		
		List<Integer> list = new ArrayList<>();
		
		Node curr = head;
		int count = 1;
		
		while(curr != null)
		{
			
			if(count % 2 != 0)
				list.add(curr.data);
			
			count++;
			curr = curr.next;
		}
		
		count = 1;
		curr = head;
		
		while(curr != null)
		{
			if(count % 2 == 0)
			{
				list.add(curr.data);
			}
			
			count++;
			curr = curr.next;
		}
		
	
		curr = head;
		int i = 0;
		while(curr != null)
		{
			curr.data = list.get(i);
			i++;
			curr = curr.next;
		}
		
		return head;
	}
	
	
	
	public static void main(String[] args) {
		
		createList();
		printList();
		groupEvenOddNodes2();
		printList();
		
		
	}
	
	

}
