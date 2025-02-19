package linkedlist;

public class Add1ToValue {
	
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
	
	public static Node reverse(Node head)
	{
		Node newHead = null;
		while(head != null)
		{
			Node next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		
		return newHead;
	}
	
	
	public static Node add1ToVal(Node head)
	{
		if(head == null)
			 return head;
		
		head = reverse(head);
		
		int carry = 1;
	    Node temp = head;
	    
	    while(temp != null)
	    {
	        temp.data += carry;
	        if(temp.data < 10)
	         {
	             carry = 0;
                break;
	         }
	         else
	         {
	             temp.data = 0;
	             carry = 1;
	         }
	         
	         temp = temp.next;
	    }
	    
	    head = reverse(head);
	    
	    if(carry == 1)
	    {
	        Node node = new Node(1);
	        node.next = head;
	        head = node;
	    }
	    
	    return head;
	}
	
	
	public static int helper(Node head)
	{
		if(head == null)
			return 1;
		
		int carry = helper(head.next);
		head.data += carry;
		if(head.data < 10)
			return 0;
		
		head.data = 0;
        return 1;
	}
	
	public static Node add1ToValRecursion(Node head)
	{
		int carry = helper(head);
		
		if(carry == 1)
		{
			Node node = new Node(1);
			node.next = head;
			head = node;
		}
		
		return head;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Node head = createList();
		head = add1ToValRecursion(head);
		printList(head);
	}

}
