package stack;

import java.util.Stack;

public class StockSpan {

    public static void stockSpan1(int arr[]) {
	int n = arr.length;
	for (int i = 0; i < n; i++) {
	    int span = 0;
	    for (int j = i; j >= 0; j--) {
		if (arr[i] >= arr[j])
		    span++;
		else
		    break;
	    }
	    System.out.print(span + " ");
	}
    }

    public static void stockSpan2(int arr[]) {
	int n = arr.length;

	int span = 1;
	System.out.print(span + " ");
	Stack<Integer> st = new Stack<>();
	st.push(0);
	for (int i = 1; i < n; i++) {
	    while (!st.isEmpty() && arr[st.peek()] <= arr[i])
		st.pop();
	    span = st.isEmpty() ? i + 1 : (i - st.peek());
	    System.out.print(span + " ");
	    st.push(i);
	}
    }
    
    public static void main(String[] args) {
	int arr[] = {13,15,12,14,16,8,6,4,10,30};
	
//	stockSpan1(arr);
//	stockSpan2(arr);
    }

}
