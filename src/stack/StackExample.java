package stack;

import java.util.Stack;

//base methods
//push() - add elements to stack and returns it
//peek()or lastElement() - gets the top of the stack 
//pop() - removes the element at the top
//search() - searches for the element ,assumes top index as -1 ;
//empty() or isEmpty() - return true if empty else false

//additional methods
//firstElement() - returns first element in stack from the the base
//get(int index)
//contains(e) - searches for the given object
//indexOf(e) - return's index of given element if present
//set(index,obj) - put another element at the given index
//lastIndexOf(e) - return's last index of given element if present
//clear() or removeAllElements() - empty's the stack
//remove(e) or removeElement(e) - removes the given element if present
//removeElementAt(index) - removes element at the given index
//size() - returns the size();
//removeElementAt(index) - removes element at a particular index
//equals(stack) - checks wheather another stack is equal to the original one
//toArray() - retuns an object array of stack
//toString() - returns a string representation of stack

//collection related
//addAll(c)
//retainAll(c)
//containsAll(c)
//removeAll(c)


//usecase
//stack.stream().collect(Collectors.toList()) - turns stack to list but 
//the order will in FIFO
//eg :- stack - [1,2] 
// list - [1,2]; but we need [2,1]
//to get in LIFO format use deque
//deque.stream().collect(Collectors.toList())
//eg:- stack - [1,2] ; 
// list - [2,1];
public class StackExample {

	public static void main(String[] args) {
		
		
		Stack<Integer> s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.lastElement());
		int k = s.pop();
		int l = s.peek();
		int f = s.search(2);
		System.out.println(f);
		
		s.clear();
		System.out.println(s.toString());
		
	}
	
}
