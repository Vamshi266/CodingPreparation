package linkedlist;

public class DeleteNthNodeFromTheLast {

	public static void printList(Node head)
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
	
	public static Node createList()
	{
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
		
	}
	
	public static Node deleteNthNodeFromLast(Node head,int pos)
	{
		if(head == null)
			 return head;
		
		int count = 0;
		
		Node curr = head;
		while(curr != null)
		{
			count++;
			curr = curr.next;
		}
		
		if(count == pos)
		{
			Node newHead = head.next;
			return newHead;
		}
		
		int res = (count - pos);
		curr = head;
		while(curr != null)
		{
			res--;
			if(res == 0)
				break;
			curr = curr.next;
		}
		
		curr.next = curr.next.next;
		
		return head;
	}
	
	public static void main(String[] args) {
		
		Node head = createList();
		printList(head);
		head = deleteNthNodeFromLast(head, 5);
		printList(head);
		
	}
	
}
