package dynamicprogramming;

import java.util.Stack;

public class StockSpan {

	//youtube
	//pepcoding - https://bit.ly/47W6s0Z
	
	
	static int[] stockSpan(int[] arr)
	{
		int[] span = new int[arr.length];
		
		Stack<Integer> st = new Stack<>();
		st.push(0); 
		span[0] = 1;
		
		for(int i=1;i<arr.length;i++)
		{
			while(st.size() > 0 && arr[i] > arr[st.peek()])
			{
				st.pop();
			}
			
			if(st.isEmpty())
			{
				span[i] = i+1;
			}
			else
			{
				span[i] = i - st.peek();
			}
			
			st.push(i);
		}
		
		return span;
	}
	
}
