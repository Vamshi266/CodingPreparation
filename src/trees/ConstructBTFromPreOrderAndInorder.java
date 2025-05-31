package trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructBTFromPreOrderAndInorder {
    public static Node buildBT(int inOrder[], int preOrder[], int inStart, int inEnd, int preStart, int preEnd,
	    Map<Integer, Integer> hm) {
	if (inStart > inEnd || preStart > preEnd)
	    return null;

	Node root = new Node(preOrder[preStart]);

	int x = hm.get(root.data);
	int numsLeft = x - inStart;

	root.left = buildBT(inOrder, preOrder, inStart, x - 1, preStart + 1, preStart + numsLeft, hm);
	root.right = buildBT(inOrder, preOrder, x + 1, inEnd, preStart + numsLeft + 1, preEnd, hm);

	return root;
    }

    public static Node buildTree(int inorder[], int preorder[]) {

	Map<Integer, Integer> hm = new HashMap<>();

	for (int i = 0; i < inorder.length; i++)
	    hm.put(inorder[i], i);

	Node root = buildBT(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1, hm);

	return root;

    }
}
