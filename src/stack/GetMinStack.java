package stack;

import java.util.Stack;

public class GetMinStack {

    // Time Complxity = O(1) for push,pop,peek
    // Space Complexity = O(n)
    static Stack<Integer> ms = new Stack<>();
    static Stack<Integer> as = new Stack<>();

    public static void push(int x) {
	if (as.peek() >= ms.peek())
	    as.push(x);
	ms.push(x);
    }

    public static void pop() {
	if (as.peek() == ms.peek())
	    as.pop();
	ms.pop();
    }

    public static void main(String[] args) {

    }

}
