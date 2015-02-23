package trees;

class Solution {
	public Solution(int i, boolean b) {
		this.height = i;
		this.val = b;
	}
	public Solution() {
		// TODO Auto-generated constructor stub
	}
	int height;
	boolean val;
}
public class IsAVL {

	public static void main(String[] args) {
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
		Solution result = isBalanced(root);
		if(result.val == false)
			System.out.println(" Not an AVL Tree");
		else
			System.out.println(" Is an AVL Tree");

	}

	public static Solution isBalanced(TreeNode root) {
		if(root == null)
			return new Solution(-1,true);
		Solution ltree = isBalanced(root.left);
		Solution rtree = isBalanced(root.right);
		if(ltree.val && rtree.val && ltree.height - rtree.height <= Math.abs(1))
			return new Solution(Math.max(ltree.height,rtree.height)+1,true);
		
		return new Solution(0,false);

	}
}

