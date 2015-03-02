package trees;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { data = x; }
 * }
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null) && (q == null))
            return true;
        else if((p != null)&&(q == null))
            return false;
        else if((p == null)&&(q != null))
            return false;
        else if(p.data != q.data)
            return false;
        else return ((isSameTree(p.left,q.left)) && (isSameTree(p.right,q.right)));
    }
}