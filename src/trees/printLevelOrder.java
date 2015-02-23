package trees;
import java.util.LinkedList;
import java.util.Queue;
class QueueData
{
	TreeNode value;
	int level;
	QueueData(TreeNode value,int level)
	{
		this.value = value;
		this.level = level;
	}
}
public class printLevelOrder {

	public static void main(String[] args) {
		// Create a queue which takes <node,level>
		// initial call : <root,0>
		// if queue is not empty, dequeue , if level is not the current level set current level to 
		// the level of the dequeued node and enqueue its children
		// print node
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
        QueueData j = new QueueData(root,0);
        Queue<QueueData> store = new LinkedList<QueueData>();
        store.add(j);
        bfs(j,store);	

	}

	public static void bfs(QueueData j, Queue<QueueData> store) {
		int cur = -1;
		while(!store.isEmpty())
		{
		QueueData temp = store.remove();
		if(cur != temp.level)
		{
			cur = temp.level;
			System.out.print("|"+" ");
		}
		if(temp.value.left != null)
		{
			QueueData e = new QueueData(temp.value.left,temp.level+1);
			store.add(e);
		}
		if(temp.value.right != null)
		{
			QueueData e = new QueueData(temp.value.right,temp.level+1);
			store.add(e);
		}
		System.out.print(temp.value.data+"  ");
	}

	}}
