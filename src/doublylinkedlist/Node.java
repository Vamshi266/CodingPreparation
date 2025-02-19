package doublylinkedlist;

public class Node {

	int data;
	Node prev = null;
	Node next = null;
	public Node(int data, Node prev, Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	public Node(int data) {
		this.data = data;
	}
	
}
