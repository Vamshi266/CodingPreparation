package linkedlist;

public class ArrayToLinkedList {

	public static Node createLinkedList(int[] arr)
	{
		if(arr == null)
			return null;
		
		int n = arr.length;
		
		Node head =new Node(arr[0]);
		Node curr = head;
		
		
		for(int i=1;i<n;i++)
		{
			Node temp = new Node(arr[i]);
			curr.next = temp;
			curr = curr.next;
		}
		
		
		return head;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {4,6,1,8,10,18};
		Node head = createLinkedList(arr); 
		
	}
	
	
}
