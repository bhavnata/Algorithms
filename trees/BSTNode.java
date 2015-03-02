package trees;


import java.util.ArrayList;

//Find maximum n elements of the Binary Search tree 
//Idea : Do inorder traversal and get k elements from the end of the array
class BSTNode<T extends Comparable<T>>
{
	T data;
	BSTNode<T> left;
	BSTNode<T> right;

	static int i = 0,n=5;
	

	public void addElement(T elem,BSTNode<T> root)
	{
		if(root == null)
			return;
		
		if((root.data.compareTo(elem) > 0) || (root.data.compareTo(elem) == 0))
		{
			if(root.left != null)
				addElement(elem,root.left);
			else 
			{
				BSTNode<T> newNode = new BSTNode<T>();
				root.left = newNode;
				root.left.data = elem;
			}
		}
		else if(root.data.compareTo(elem) < 0)
		{
			if(root.right != null)
				addElement(elem,root.right);
			else 
			{
				BSTNode<T> newNode = new BSTNode<T>();
				root.right = newNode;
				root.right.data = elem;
			}
		}

	}

	public BSTNode<T> createBinarySearchTree(T[] elements)
	{
		BSTNode<T> root = new BSTNode<T>();
		root.data = elements[0];
		for(int i=1;i<elements.length;i++)
		{
			addElement(elements[i],root);
		}
		return root;
	}
	// Function to find N Nodes from Inorder 
	public void findNNodes(BSTNode<T> root)
	{
		ArrayList<T> valueArray = new ArrayList<T>();
		BSTNode<T> obj = new BSTNode<T>();
		obj.inOrder(root,valueArray);
		System.out.print(valueArray);
	}
	// Function to traverse tree in Inorder  
	public void inOrder(BSTNode<T> root,ArrayList<T> valueArray)
	{
		if(root == null)
			return;
		
		inOrder(root.right,valueArray);
		if(valueArray.size() == n)
			return;
		valueArray.add(root.data);
		inOrder(root.left,valueArray);

	} 
	public static void main(String[] args)
	{
		BSTNode<Integer> driver = new BSTNode<Integer>();
		Integer[] elements = {10,15,2,3,5,6,7,90,8};
		BSTNode<Integer> root = driver.createBinarySearchTree(elements);
		driver.findNNodes(root);
	}
}


