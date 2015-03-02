package trees;



public class LcaBinarySearchTree {
		 
	    public static TreeNode  findLCA(TreeNode  root, int n1,int n2){
	 
	        if(root == null){
	            return null;
	        }
	 
	        int data = (int) root.getData();
	        if(data > n1 && data > n2){
	            return findLCA(root.getLeft(),n1, n2);
	        }
	 
	        if(data < n1 && data < n2){
	            return findLCA(root.getRight(), n1, n2);
	        }
	        if(n1 <= data && n2 >= data)
	        return root;
	        else
	        return null;
	    }
	 
	    public static void main(String args[]){
	 
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
	 
	        System.out.println("LCA : " + findLCA(root,10,14).getData());
	    }
	}

