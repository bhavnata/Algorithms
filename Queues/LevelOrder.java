package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import trees.TreeNode;

class QueueNode
{
 TreeNode node;
 int level;
 
 QueueNode(TreeNode node,int level)
 {
     this.node = node;
     this.level = level;
 }
}
public class LevelOrder {
	public static void main(String[] args){
		TreeNode   root = new TreeNode  (20);
		 
        TreeNode   l = new TreeNode  (8);
        TreeNode   r = new TreeNode  (22);
 
        TreeNode   ll = new TreeNode  (4);
        TreeNode   lr = new TreeNode  (12);
 
        TreeNode   lrl = new TreeNode  (10);
        TreeNode   lrr = new TreeNode  (14);
 
        root.setLeft(l);
        root.setRight(r);
 
        l.setLeft(ll);
        l.setRight(lr);
 
        lr.setLeft(lrl);
        lr.setRight(lrr);
		List<List<Integer>> result = levelOrderTraverse(root);
	}
    public static List<List<Integer>> levelOrderTraverse(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        // Queue that has nodes of the current level
        Queue<QueueNode> mainQueue = new LinkedList<QueueNode>();
        
        // Put root into the queue put its children in the queue
        if(root != null){
            mainQueue.add(new QueueNode(root,0));
        }
        while(!mainQueue.isEmpty()){
            QueueNode u = mainQueue.remove();
            System.out.println(u.node.getData());
            if(u.node.getLeft() != null){
                    mainQueue.add(new QueueNode(u.node.getLeft(),u.level+1));
                }
            if(u.node.getRight() != null){
                    mainQueue.add(new QueueNode(u.node.getRight(),u.level+1));
                }
        }
		return ret;
    }
}