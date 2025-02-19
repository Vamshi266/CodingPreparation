package linkedlist;

import java.util.HashMap;

public class FirstNodeOfLoopInLinkedList {

	
	//Time Complexity = O(n)
	//Space Complexity = O(1)
	public static int findFirstNode(Node head)
	{
		Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast)
            {
                slow = head;
                while(slow != fast)
                {
                    slow = slow.next;
                    fast = fast.next;
                }
                
                return slow.data;
            }
        }
        
      
        
        return -1;
	}
	
	
	//Time Complexity = O(n)
	//Space Complexity = O(n)
	public static int findFirstNode2(Node head)
	{
		HashMap<Node,Integer> hm = new HashMap<>();
        
        Node temp = head;
        
        while(temp != null)
        {
            if(!hm.containsKey(temp))
             hm.put(temp,1);
            else
             return temp.data;
            temp = temp.next;
        }
        
        return -1;
	}
	
}
