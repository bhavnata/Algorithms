package trees;

import java.util.Stack;

class IterativeInorder
{
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(20);

		TreeNode    l = new TreeNode(8);
		TreeNode    r = new TreeNode(22);

		TreeNode    ll = new TreeNode(4);
		TreeNode    lr = new TreeNode(12);

		TreeNode    lrl = new TreeNode(10);
		TreeNode    lrr = new TreeNode(14);

		root.setLeft(l);
		root.setRight(r);

		l.setLeft(ll);
		l.setRight(lr);

		lr.setLeft(lrl);
		lr.setRight(lrr);

		inorderIterative(root);
	}
	// Function to retrieve elements in the Order - Left , Root and Right
	public static void inorderIterative(TreeNode root)
	{
		Stack<TreeNode> numbers = new Stack<TreeNode>();
		TreeNode current = root;
		while(current != null)
		{
			numbers.push(current);
			current=current.getLeft();
		}
		while(!numbers.isEmpty())
		{
			TreeNode node = numbers.pop();
			System.out.print(node.data+ " ");
			current = node.getRight();
			while(current != null)
			{
				numbers.push(current);
				current=current.getLeft();
			}
		}

	}
}

