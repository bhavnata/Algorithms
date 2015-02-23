package trees;

import java.util.Stack;

public class BSTIterator {
	TreeNode root;
	Stack<TreeNode> numbers = new Stack<TreeNode>();
	public BSTIterator(TreeNode root) {
		TreeNode current = root;
		while(current != null)
		{
			numbers.push(current);
			current = current.left;
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		if(!numbers.isEmpty())
			return true;
		else
			return false;
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node = numbers.pop();
		TreeNode current = node.right;
		while(current != null)
		{
			numbers.push(current);
			current = current.left;
		}
		return node.data;
	}


}
