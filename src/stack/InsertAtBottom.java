package stack;

import java.util.Stack;

public class InsertAtBottom {

	public static void insertAtBottom(Stack<Integer> s,int k)
	{
		//remove all the elements till the stack becomes empty
		if(s.isEmpty())
		{
			//then push the target element
			s.push(k);
			return;
		}
		
		//pop every elemnt in stack
		int temp = s.pop();
		insertAtBottom(s, k);
		//in reverse order as in recursion push the respective element popped
		s.push(temp);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		insertAtBottom(s, 7);
		System.out.println(s);
		
	}
	
	
}
