package doublylinkedlist;

public class ArrayToDll {
	
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
	
	
	public static Node arrayToDll(int arr[])
	{
		
		head = new Node(arr[0]);
		Node p = head;
		
		for(int i=1;i<arr.length;i++)
		{
			Node temp = new Node(arr[i]);
			temp.prev = p;
			p.next = temp;
			p = temp;
		}
		
		return head;
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
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
//		createList();
		
		arrayToDll(arr);
		printList();
		
		
		
		
	}
	
	
	
	
}
