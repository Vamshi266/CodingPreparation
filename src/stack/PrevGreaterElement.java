package stack;

import java.util.Stack;

public class PrevGreaterElement {

    public static void prevGreat1(int arr[]) {
	int n = arr.length;

	for (int i = 0; i < n; i++) {
	    int pg = -1;

	    for (int j = i - 1; j >= 0; j--) {
		if (arr[j] > arr[i]) {
		    pg = arr[j];
		    break;
		}
	    }

	    System.out.print(pg + " ");
	}
    }

    public static void prevGreat2(int arr[]) {

	int n = arr.length;
	int pg = -1;
	Stack<Integer> st = new Stack<>();
	System.out.print(pg + " ");
	st.push(arr[0]);
	for (int i = 1; i < n; i++) {
	    while (!st.isEmpty() && arr[i] >= st.peek())
		st.pop();
	    pg = st.isEmpty() ? -1 : st.peek();
	    System.out.print(pg + " ");
	    st.push(arr[i]);
	}
    }

    public static void main(String[] args) {

	int arr[] = { 20, 30, 10, 5, 15 };

//	prevGreat1(arr);
	prevGreat2(arr);
    }

}
