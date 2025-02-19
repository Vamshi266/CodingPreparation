package linkedlist;

public class Sort0s1s2s {
	
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
		
		Node n1 = new Node(2);
		Node n2 = new Node(2);
		Node n3 = new Node(1);
		Node n4 = new Node(0);
		Node n5 = new Node(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		return n1;
		
	}
	
	//Time Complexity = O(n)
	//Space Complexity = O(1)
	public static Node sortZerosTwosOnes(Node head)
	{
		
		if(head == null || head.next == null)
			 return head;
		
		int cnt0 = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		
		Node curr = head;
		
		while(curr != null)
		{
			if(curr.data == 0)
				cnt0++;
			else if(curr.data == 1)
				cnt1++;
			else if(curr.data == 2)
				cnt2++;
			curr = curr.next;
		}
		
		curr = head;
		
		while(curr != null)
		{
			if(cnt0 > 0)
			{
				curr.data = 0;
				cnt0--;
			}
			else if(cnt1 > 0)
			{
				curr.data = 1;
				cnt1--;
			}
			else if(cnt2 > 0)
			{
				curr.data = 2;
				cnt2--;
			}
			
			curr = curr.next;
			
		}
		
		return head;
		
	}
	
	public static Node sortZerosTwosOnes2(Node head)
	{
		
		if(head == null || head.next == null)
			 return head;
		
		Node zero = new Node(-1);
		Node one = new Node(-1);
		Node two  = new Node(-1);
		
		Node zeroHead = zero;
		Node oneHead = one;
		Node twoHead = two;
		
		Node curr = head;
		
		while(curr != null)
		{
			if(curr.data == 0)
			{
				zero.next = curr;
				zero = zero.next;
			}
			else if(curr.data == 1)
			{
				one.next = curr;
				one = one.next;
			}
			else
			{
				two.next = curr;
				two = two.next;
			}
			
			curr = curr.next;
		}
		
		
		zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
		
		one.next = twoHead.next;
		
		two.next = null;
		 
		Node newHead = zeroHead.next;
		
		return newHead;
	}
	
	public static void main(String[] args) {

			
		
		Node head = createList();
		printList(head);
		head = sortZerosTwosOnes2(head);
		printList(head);
		
		
		
	}

}
