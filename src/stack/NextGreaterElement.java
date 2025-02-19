package stack;

//youtube
//helloworld - https://rb.gy/6bdkia
//tuf - https://rb.gy/6fftem
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    // circular array implementation
    public static int[] nextGreater2(int arr[]) {
	int n = arr.length;
	if (n == 0 || n == 1)
	    return arr;

	Stack<Integer> s = new Stack<>();
	int nge[] = new int[n];
	s.push(arr[n - 1]);
	nge[n - 1] = -1;

	// start with double the array
	for (int i = 2 * n - 1; i >= 0; i--) {
	    // pop until you get a element which is greater than current element
	    // here a[i%n] gives a[i] when i > n
	    // for eg : if n = 5 i=6 i%n = 6%5 is i = 1
	    // for eg : if n = 5 i=7 i%n = 7%5 is i = 2 ...

	    while (!s.isEmpty() && arr[i % n] >= s.peek())
		s.pop();

	    // if stack is not empty then the top element in nge or -1
	    if (i < n)
		nge[i] = (!s.isEmpty()) ? s.peek() : -1;
	    // push the current element
	    s.push(arr[i % n]);
	}

	return nge;

    }

    // leetcode variation
    public static int[] nextGreaterElement(int[] arr1, int[] arr2) {
	Stack<Integer> s = new Stack<>();
	Map<Integer, Integer> hm = new HashMap<>();
	int n = arr2.length;
	hm.put(arr2[n - 1], -1);

	for (int i = n - 2; i >= 0; i--) {
	    while (!s.isEmpty() && arr2[i] >= s.peek())
		s.pop();

	    int temp = (!s.isEmpty()) ? s.peek() : -1;
	    s.push(arr2[i]);
	    hm.put(arr2[i], temp);
	}

	n = arr1.length;
	int res[] = new int[n];

	for (int i = 0; i < n; i++) {
	    res[i] = hm.get(arr1[i]);
	}

	return res;
    }

    public static int[] nextGreater(int arr[]) {
	int n = arr.length;
	if (n == 0 || n == 1)
	    return arr;

	Stack<Integer> s = new Stack<>();
	int nge[] = new int[n];
	s.push(arr[n - 1]);
	nge[n - 1] = -1;

	for (int i = n - 2; i >= 0; i--) {
	    // pop until you get a element which is greater than current element
	    while (!s.isEmpty() && arr[i] >= s.peek())
		s.pop();

	    // if stack is not empty then the top element in nge or -1
	    nge[i] = (!s.isEmpty()) ? s.peek() : -1;
	    // push the current element
	    s.push(arr[i]);
	}

	return nge;

    }

    public static void nextGreater3(int arr[]) {

	int n = arr.length;

	for (int i = 0; i < n; i++) {
	    int ng = -1;
	    for (int j = i + 1; j < n; j++) {
		if (arr[j] > arr[i]) {
		    ng = arr[j];
		    break;
		}
	    }
	    System.out.print(ng + " ");
	}
    }

    public static void main(String[] args) {

//	int arr[] = { 5, 15, 10, 8, 6, 12, 9, 18 };
	int arr[] = { 5, 15, 10, 8, 6, 12, 7 };
//	int res[] = nextGreater2(arr);
//	for (int i : res) {
//	    System.out.print(i + " ");
//	}

	nextGreater3(arr);

    }

}
