package stack;

import java.util.Stack;

public class ReverseStack {

	public static void reverseStack(Stack<Integer> s)
	{
		
		if(s.isEmpty())
			return;
		
		int temp = s.pop();
		//call recursively until stack is empty
		reverseStack(s);
		//when we get back insert the popped element at the bottom of the stack 
		//in that way what ever we popped in order will be inserted in the reverse order
		InsertAtBottom.insertAtBottom(s, temp);
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println(s);
		reverseStack(s);
		System.out.println(s);
	
		
	}
	
	
}
