package trees;

public class Treesize {

	public static void main(String[] args) {
		TreeNode  root = new TreeNode (20);
		 
        TreeNode  l = new TreeNode (8);
        TreeNode  r = new TreeNode (22);
 
        TreeNode  ll = new TreeNode (4);
        TreeNode  lr = new TreeNode (12);
 
        TreeNode  lrl = new TreeNode (10);
        TreeNode  lrr = new TreeNode (14);
 
        root.setLeft(l);
        root.setRight(r);
 
        l.setLeft(ll);
        l.setRight(lr);
 
        lr.setLeft(lrl);
        lr.setRight(lrr);
        int resultSize = findTreeSize(root);
        System.out.println("Size of the tree is  "+resultSize);

	}

	public static int findTreeSize(TreeNode  root) {
		if(root == null)
			return 0;
		else
			return findTreeSize(root.getLeft()) + findTreeSize(root.getRight()) + 1;
	}

}
