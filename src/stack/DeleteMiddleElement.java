package stack;

import java.util.Stack;

public class DeleteMiddleElement {

	public static void deleteMid(Stack<Integer> st,int index,int n)
	{
		//if index equals (n/2)
		if(index == (n/2))
		{
			st.pop();
			return;
		}
		
		//pop every element before (n/2) index element
		int temp = st.pop();
		deleteMid(st,index+1,n);
		//push all the elements removed before 
		st.push(temp);
	}
	
	
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		System.out.println(st);
		deleteMid(st,0,st.size());
		System.out.println(st);
		
	}
	
	
}
