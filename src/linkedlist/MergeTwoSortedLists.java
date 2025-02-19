package linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLists {

    // Time Complexity = O(nlogn)
    // Space Complexity = O(n)
    public static Node mergeLists1(Node list1, Node list2) {
	Node dummy = new Node(-1);
	Node temp = dummy;

	Node t1 = list1;
	Node t2 = list2;

	while (t1 != null && t2 != null) {
	    if (t1.data < t2.data) {
		temp.next = t1;
		temp = t1;
		t1 = t1.next;
	    } else {
		temp.next = t2;
		temp = t2;
		t2 = t2.next;
	    }
	}

	while (t1 != null) {
	    temp.next = t1;
	    temp = t1;
	    t1 = t1.next;
	}

	while (t2 != null) {
	    temp.next = t2;
	    temp = t2;
	    t2 = t2.next;
	}

	return dummy.next;

    }

    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public static Node mergeLists2(Node list1, Node list2) {
	ArrayList<Integer> al = new ArrayList<>();
	Node temp1 = list1, temp2 = list2;
	while (temp1 != null) {
	    al.add(temp1.data);
	    temp1 = temp1.next;
	}

	while (temp2 != null) {
	    al.add(temp2.data);
	    temp2 = temp2.next;
	}

	Collections.sort(al);

	Node head = null, temp = null;

	Node curr = head;
	for (int i = 0; i < al.size(); i++) {
	    temp = new Node(al.get(i));
	    if (i == 0) {
		head = temp;
		curr = head;
		continue;
	    }

	    curr.next = temp;
	    curr = temp;
	}

	return head;
    }

}
