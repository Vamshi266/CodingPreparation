package trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructBTFromPostOrderAndInorder {
    public static Node buildBT(int inOrder[], int postOrder[], int inStart, int inEnd, int postStart, int postEnd,
	    Map<Integer, Integer> hm) {
	if (inStart > inEnd || postStart > postEnd)
	    return null;

	Node root = new Node(postOrder[postEnd]);

	int x = hm.get(root.data);
	int numsLeft = x - inStart;

	root.left = buildBT(inOrder, postOrder, inStart, x - 1, postStart, postStart + numsLeft - 1, hm);
	root.right = buildBT(inOrder, postOrder, x + 1, inEnd, postStart + numsLeft, postEnd - 1, hm);

	return root;
    }

    public static Node buildTree(int inorder[], int postorder[]) {

	Map<Integer, Integer> hm = new HashMap<>();

	for (int i = 0; i < inorder.length; i++)
	    hm.put(inorder[i], i);

	Node root = buildBT(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, hm);

	return root;

    }

}
