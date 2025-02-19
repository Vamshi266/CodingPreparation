package stack;

import java.util.Stack;

public class SortStack {

	
	public static void sortedInsert(Stack<Integer> s,int n)
	{
		if(s.isEmpty() || (!s.isEmpty() && s.peek() < n))
		{
			s.push(n);
			return;
		}
		
		int temp = s.pop();
		sortedInsert(s, n);
		s.push(temp);
	}
	
	public static void sortStack(Stack<Integer> s)
	{
		if(s.isEmpty())
			return;
		
		int temp = s.pop();
		sortStack(s);
		sortedInsert(s, temp);
		
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		
		
		System.out.println(s);
		sortStack(s);
		System.out.println(s);
		
	}
	
}
