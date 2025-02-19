package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackImplementationUsingTwoQueues {

	//youtube
	//tuf - http://rb.gy/15hn31
	
	private static Deque<Integer> q1 = new ArrayDeque<>();
	private static Deque<Integer> q2 = new ArrayDeque<>();
	
	//double queue implementation
	public static void push(int n)
	{
		
		//add it q2
		//remove all elements in q1 and add it to q2 in FIFO order
		//copy q2 to q1 and make q2 empty
	  q2.addFirst(n);
	  while(!q1.isEmpty())
	  {
		  q2.addFirst(q1.removeFirst());
	  }
	  
	  while(!q2.isEmpty())
	  {
		  q1.addFirst(q2.removeFirst());
	  }
	}
	
	
//	similar to stack
	public static int pop()
	{
		 return q1.removeLast();
	}
	
//	similar to stack
	public static int peek()
	{
		
		return q1.getLast();
	}
	
	public static void main(String[] args) {
		
		push(4);
		push(3);
		push(2);
		push(1);
		
		System.out.println(q1);
		
		pop();
		System.out.println(q1);
	}
}
