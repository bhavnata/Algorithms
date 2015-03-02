package trees;

public class maxDepth
{
	static int count1=1,count2=1;
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
		int result = findMaxDepth(root);
		int result2 = MinDepth(root);
		System.out.println(result);
	}
	public static int MinDepth(TreeNode root) {
		if(root == null)
			return 0;
		while(root.left != null)
		{
			root = root.left;
			count1++;
		}
		while(root.right != null)
		{
			root = root.right;
			count2++;
		}
		return count1 < count2 ? count1 : count2;
	}

	public static int findMaxDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		int h1 = findMaxDepth(root.left);
		int h2 = findMaxDepth(root.right);
		return h1 > h2 ? h1+1 : h2+1 ;
	}
}
