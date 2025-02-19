package linkedlist;

import java.util.HashMap;

public class LengthOfLoop {
	
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
		n5.next = n1;
		
		return n1;
		
	}
	
	
	//Time Complexity = O(n)
	//Space Complexity = O(n);
	public static int loopLength(Node head)
	{
		if(head == null)
			return 0;
		
		HashMap<Node,Integer> hm = new HashMap<>();
		
		Node curr = head;
		int timer = 0;
		while(curr != null)
		{
			if(hm.containsKey(curr))
			{
				int val = hm.get(curr);
				return timer-val;
			}
			else
			{
				 hm.put(curr, timer);
			}
			
			timer++;
			curr = curr.next;
		}
		
		return 0;
	}
	
	public static int loopLength2(Node head)
	{
		if(head == null)
			 return 0;
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return findLen(fast, slow);
		}
		
		
		return 0;
	}
	
	public static int findLen(Node fast,Node slow)
	{
		
		fast = fast.next;
		int cnt = 1;
		
		while(fast != slow)
		{
			fast = fast.next;
			cnt++;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
		
		Node head = createList();
		int len = loopLength2(head);
		System.out.println(len);
		
	}

}
