package linkedlist;

import java.util.ArrayList;
import java.util.Collections;

class Node1 {
    int data;
    Node1 next;
    Node1 bottom;

    Node1(int d) {
	data = d;
	next = null;
	bottom = null;
    }
}

public class FlattenALinkedList {

    // Time Complexity = X log (X) where x = (N * M)
    // Space Complexity = O(N * M)
    Node1 flattenList(Node1 root) {
	Node1 temp = root;

	ArrayList<Integer> al = new ArrayList<>();
	while (temp != null) {
	    Node1 child = temp.bottom;
	    al.add(temp.data);
	    while (child != null) {
		al.add(child.data);
		child = child.bottom;

	    }
	    temp = temp.next;
	}

	Collections.sort(al);

	Node1 head = new Node1(al.get(0));

	temp = head;

	for (int i = 1; i < al.size(); i++) {
	    temp.bottom = new Node1(al.get(i));
	    temp = temp.bottom;
	}

	return head;
    }

    // Time Complexity = O(N * M)
    // Space Complexity = O(N)

    Node1 flatten(Node1 root) {
	return util(root);
    }

    Node1 merge(Node1 list1, Node1 list2) {
	Node1 dummy = new Node1(-1);
	Node1 res = dummy;

	while (list1 != null && list2 != null) {
	    if (list1.data < list2.data) {
		res.bottom = list1;
		res = list1;
		list1 = list1.bottom;
	    } else {
		res.bottom = list2;
		res = list2;
		list2 = list2.bottom;
	    }

	    res.next = null;
	}

	if (list1 != null) {
	    res.bottom = list1;
	} else {
	    res.bottom = list2;
	}

	return dummy.bottom;

    }

    Node1 util(Node1 node) {
	if (node == null || node.next == null)
	    return node;

	Node1 mergedHead = util(node.next);
	return merge(mergedHead, node);
    }
}
