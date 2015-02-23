package trees;

import java.util.ArrayList;

//Find maximum n elements of the Binary Search tree 
//Idea : Do inorder traversal and get k elements from the end of the array
class PrintNNodes
{  
	static int i = 0;
	static ArrayList<Integer> valueArray = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		int n = 5;
		TreeNode    root = new TreeNode(20);

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
		
		findNNodes(root,n);
		
	}
	// Function to find N Nodes from Inorder 
	public static void findNNodes(TreeNode root,int n)
	{		
		inOrder(root);
		int size = valueArray.size();
		for(int i=size-n;i<size;i++)
			System.out.print(" "+valueArray.get(i));
	}
	// Function to traverse tree in Inorder  
	public static void inOrder(TreeNode root)
	{
		if(root == null)
			return;
		inOrder(root.getLeft());
		valueArray.add(i++,root.getData());
		inOrder(root.getRight());
		
	}    
}


