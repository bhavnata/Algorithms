package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Symmetry
{
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(20);

		TreeNode    l = new TreeNode(8);
		TreeNode    r = new TreeNode(8);

		TreeNode    ll = new TreeNode(4);
		//		TreeNode    lr = new TreeNode(12);
		//
		//		TreeNode    lrl = new TreeNode(12);
		TreeNode    lrr = new TreeNode(4);

		root.setLeft(l);
		root.setRight(r);

		l.setLeft(ll);
		//		l.setRight(lr);
		//
		//		lr.setLeft(lrl);
		r.setLeft(lrr);

		boolean result = isSymmetric(root);
		if(result == true)
			System.out.println("Yes! The trees are symmetric");
		else
			System.out.println("No! They are not");
	}
	// Function to retrieve elements in the Order - Left , Root and Right
	public static boolean isSymmetric(TreeNode root)
	{

		if(root == null)
			return true;
		if(root.getLeft() == null && root.getRight() != null)
			return false;
		else if(root.getRight() == null && root.getLeft() != null)
			return false;
		else if (root.getRight() == null && root.getLeft() == null)
			return false;
		ArrayList<Integer> numbers1 = retLevelOrderLeft(root.getLeft());
		ArrayList<Integer> numbers2 = retLevelOrderRight(root.getRight());
				System.out.print("    ::::::::::  "+numbers1+ " **********     "+numbers2);
		for(int i=0;i<numbers1.size();i++)
			if(numbers1.get(i) != numbers2.get(i))
				return false;
		return true;

	}
	public static ArrayList<Integer> retLevelOrderLeft(TreeNode root) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		Queue<TreeNode> ds = new LinkedList<TreeNode>();
		ds.add(root);
		while(!ds.isEmpty())
		{
			TreeNode u = ds.remove();
			ret.add(u.getData());
			if(u.getLeft() != null)
				ds.add(u.getLeft());
			else
				ret.add(0);
			if(u.getRight() != null)
				ds.add(u.getRight());
			else
				ret.add(0);

		}
		return ret;
	}
	public static ArrayList<Integer> retLevelOrderRight(TreeNode root) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		Queue<TreeNode> ds1 = new LinkedList<TreeNode>();
		ds1.add(root);
		while(!ds1.isEmpty())
		{
			TreeNode u = ds1.remove();
			//			System.out.print(u.data+"  ");
			ret.add(u.getData());
			if(u.getRight() != null)
				ds1.add(u.getRight());
			else
				ret.add(0);
			if(u.getLeft() != null)
				ds1.add(u.getLeft());
			else
				ret.add(0);
		}
		return ret;
	}
}



