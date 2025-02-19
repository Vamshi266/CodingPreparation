package doublylinkedlist;

public class DoublyLinkedListExample {
	
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
		System.out.println("");
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

	public static void addAtEnd(int val)
	{
		if(head == null)
			System.out.println("list is empty");
		
		
		Node curr = head;
		
		while(curr.next != null)
		{
			curr = curr.next;
		}
		
		Node temp = new Node(val);
		curr.next = temp;
		temp.prev = curr;
		
		return;
	}
	
	public static void addAtBegin(int val)
	{
		if(head == null)
			System.out.println("list is empty");
		
		
		Node temp = new Node(val);
		temp.next = head;
		head.prev = temp;
		head = temp;
	}
	
	public static void deleteAtBegin()
	{
		if(head == null)
			System.out.println("list is empty");
		
		
		
		head = head.next;
		head.prev = null;
		
		return;
	}
	
	public static void deleteAtEnd()
	{
		if(head == null)
			System.out.println("list is empty");
		
		Node curr = head;
		
		while(curr.next != null)
		{
			curr = curr.next;
		}
		
		Node temp = curr.prev;
		temp.next = null;
		
		return;
		
	}
	
	
	
	public static void main(String[] args) {
	
		createList();
		printList();
//		addAtBegin(10);
//		addAtEnd(10);
//		deleteAtBegin();
		deleteAtEnd();
		printList();
		
		
	}
	
	
	
}
