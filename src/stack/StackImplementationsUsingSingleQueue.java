package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackImplementationsUsingSingleQueue {

	//youtube
	//tuf - http://rb.gy/15hn31
	
	private static Deque<Integer> q = new ArrayDeque<>();
	
	public static void push(int n)
	{
		//add it to queue
		q.addLast(n);
		//remove all elements before the inserted element 
		//and start inserting them one by one
		for(int i=0;i<q.size();i++)
		{
			q.addLast(q.removeFirst());
		}
	}
	
	public static int pop()
	{
		return q.removeLast();
	}
	
	public static int peek()
	{
		return q.getLast();
	}
	
	public static void main(String[] args) {
		
		push(3);
		push(4);
		push(2);
		push(1);
		
		System.out.println(peek());
		pop();
		System.out.println(peek());
		
		
		
	}
	
	
}
