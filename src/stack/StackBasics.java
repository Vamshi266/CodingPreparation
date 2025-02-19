package stack;

import java.util.Arrays;


class StackImpl
{	
	static final int SIZE = 100;
	int arr[] = new int[SIZE];
	private int top;
	
	//constructor
	StackImpl()
	{
		top = -1;
	}
	
	//add elements
	public boolean push(int e)
	{
		if(top >= SIZE-1)
		{
			System.out.println("overflow");
			return false;
		}
		
		arr[++top] = e;
		return true;
	}
	
	//remove elements
	public int pop()
	{
		if(top < 0)
			return -1;
		
		int temp = arr[top--];
		return temp;
	}
	
	public int peek()
	{
		if(top < 0)
		{
			System.out.println("underflow");
			return -1;
		}
		
		return arr[top];
	}
	
	//check if stack is empty
	public boolean isEmpty()
	{
		return (top < 0);

	}
	
	public void print()
	{
		if(top < 0)
		{
			System.out.println("underflow");
			return;
		}
		
		System.out.print("{");
		for(int i=0;i<=top;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("}");
	}
	
	
}

public class StackBasics {

	public static void main(String[] args) {
		
//		Stack<Integer> stack = new Stack<>();
//		
//		//add element : push()
//		stack.push(5);
//		stack.push(4);
//		stack.push(3);
//		stack.push(2);
//		stack.push(1);
//		System.out.println(stack);
//		
//		//remove elements : pop()
//		stack.pop();
//		System.out.println(stack);
//		
//		//get top element : peek()
//		System.out.println(stack.peek());
//		
//		//checks whether stack is empty
//		System.out.println(stack.isEmpty());
//		
//		//checks size of stack : size()
//		System.out.println(stack.size());
//		----------------------------
		StackImpl s = new StackImpl();
		
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.print();
		s.pop();
		s.pop();
		s.pop();
		s.print();
		System.out.println("\n"+s.peek());
		s.pop();
		s.pop();
		System.out.println(s.isEmpty());
		
		
		
		
		
		
	}
	
	
}
