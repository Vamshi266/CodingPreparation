package linkedlist;

public class LinkedListExample {

	//it's basically the traversal of list
	//Time Complexity = O(n)
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
	
	//same as traversal. we keep the count of nodes traversed.
	//we will trversal the whole list to get the length of list
	//Time Complexity = O(n)
	public static int length(Node head)
	{
		if(head == null)
			 return 0;
		
		Node curr = head;
		int count = 0;
		while(curr != null)
		{
			count++;
			curr = curr.next;
		}
		
		return count;
	}
	
	//Time Complexity = O(n)
	public static int search(Node head,int val)
	{
		
		if(head == null)
		{
			System.out.println("list is empty");
			return -1;
		}
		
		Node curr = head;
		int index = 0;
		
		while(curr != null)
		{
			index++;
			if(curr.data == val)
				return index;
			curr = curr.next;
		}
		
		return index;
		
	}
	
	//Time Complexity = O(1)
	public static Node addAtBegin(Node head,int val)
	{
		if(head == null)
		{
			System.out.println("list is empty");
			return null;
		}
		
		Node temp = new Node(val);
		temp.next = head;
		head = temp;
		
		return head;
		
	}
	
	//Time Complexity = O(n)
	public static void addAtEnd(Node head,int val)
	{
		if(head == null)
		{
			System.out.println("list is empty");
		}
		
		Node curr = head;
		
		while(curr.next != null)
			curr = curr.next;
		
		curr.next = new Node(val);
	}
	
	//Time Complexity = O(n)
	public static void addAtPos(Node head,int pos,int val)
	{
		if(head == null)
			System.out.println("list is empty");
		
		
		Node curr = head;
		Node prev = null;
		int count = 1;
		while(curr != null)
		{
			if(count == pos)
			{
				Node node = new Node(val);
				prev.next = node;
				return;
			}
			
			prev = curr;
			curr = curr.next;
			count++;
		}
		
		if(count < pos)
		  System.out.println("position is out of bounds");
		
	}
	
	//Time Complexity = O(n)
	public static void addAtValue(Node head,int val,int data)
	{
		if(head == null)
		  System.out.println("list is null");
		
		Node curr = head;
		
		while(curr != null)
		{
			if(curr.data == val)
			{
				Node node = new Node(data);
				node.next = curr.next;
				curr.next = node;
			}
			
			curr = curr.next;
		}
	}
	
	//Time Complexity = O(1)
	public static void deleteAtBegin(Node head)
	{
		if(head == null)
			System.out.println("List is empty");
		
		head = head.next;
	}
	
	//Time Complexity = O(1)
	public static void deleteAtEnd(Node head)
	{
		if(head == null)
		{
			System.out.println("list is empty");
		}
		
		Node curr = head;
		Node prev = null;
		
		while(curr.next != null)
		{
			prev = curr;
			curr = curr.next;
		}
		
		prev.next = null;
	}
	
	//Time Complexity = O(n)
	public static void deleteAtPos(Node head,int pos)
	{
		
		if(head == null)
		{
			System.out.println("list is empty");
		}
		
		Node curr = head;
		Node prev = head;
		int count = 1;
		
		while(curr != null)
		{
			if(pos == count)
			{
				prev.next = curr.next;
				return;
			}
			
			prev = curr;
			curr = curr.next;
			count++;
		}
		
		if(count < pos)
			  System.out.println("position is out of bounds");
		
	}
	
	//Time Complexity = O(n)
	public static void deleteAtVal(Node head,int val)
	{
		if(head == null)
			System.out.println("list is null");
		
		
		Node curr = head;
		Node prev = head;
		while(curr != null)
		{
			if(curr.data == val)
			{
				prev.next = curr.next;
				return;
			}
			
			prev = curr;
			curr = curr.next;
		}
	
	}
	
	
	public static void main(String[] args) {
		
		

//		printList(n1);
//		addAtEnd(n1, 28);
//		int index = search(n1, 25);
//		System.out.println(index);
//		System.out.println();
//		printList(n1);
//		deleteAtEnd(n1);
//		deleteAtPos(n1,3);
//		deleteAtEnd(n1);
//		addAtBegin(20);
//		addAtValue(25,2);
		
	}
	
}
