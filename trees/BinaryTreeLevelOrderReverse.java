package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class QueueNode
{
    TreeNode node;
    int level;
    QueueNode(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
    
}
public class BinaryTreeLevelOrderReverse{
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        Queue<QueueNode> nodequeue = new LinkedList<QueueNode>();
        if(root == null){
            return retList;
        }
        nodequeue.add(new QueueNode(root,0));
        while(!nodequeue.isEmpty()){
            QueueNode u = nodequeue.remove();
            if(retList.size() <= u.level){
                retList.add(new ArrayList<Integer>());
            }
            retList.get(u.level).add(u.node.data);
            if(u.node.left != null){
                nodequeue.add(new QueueNode(u.node.left,u.level+1));
            }
            if(u.node.right != null){
                nodequeue.add(new QueueNode(u.node.right,u.level+1));
            }
        }
        Collections.reverse(retList);
        return retList;
    }
}
