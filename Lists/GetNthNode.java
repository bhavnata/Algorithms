package Lists;
class Node<E>
{
	E data;
	Node<E> next;
	Node(E data)
	{
		this.data = data;
		this.next = null;
	}
	Node(E data,Node<E> next)
	{
		this.data = data;
		this.next = next;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}

}
class LinkedList<T>
{
	private Node<T> head;
	public Node<T> getHead() {
		return head;
	}
	public void setHead(Node<T> head) {
		this.head = head;
	}
	private int listCount;

	LinkedList()
	{
		head = null;
		listCount = 0;
	}
//	public void add(T data,int index)
//	{
//		int count = 0;
//		Node<T> node = new Node<T>(data);
//		Node<T> refPointer = head;
//		while(refPointer.getNext()!=null && count<index)
//		{
//			refPointer = refPointer.getNext();
//			count++;
//		}
//		node.setNext(refPointer.getNext());
//		refPointer.setNext(node);
//		listCount++;
//
//	}
	public void addNode(T data)
	{
		Node<T> node = new Node<T>(data);
		if(head == null)
			head = node;
		else		
		node.setNext(head);
		head = node;
	}
	public Object get(int index)
	{
		Node<T> refPointer = head;
		for(int i =0; i< index;i++)
		{
			if(refPointer.getNext() == null)
				return null;
			refPointer = refPointer.getNext();
		}
		return refPointer.getData();
	}
	public boolean remove(int index)
	{
		Node<T> refPointer = head;
		Node<T> prevPointer = null;
		for(int i =0; i< index;i++)
		{
			if(refPointer.getNext() == null)
				return false;
			prevPointer = refPointer;
			refPointer = refPointer.getNext();
		}
		prevPointer.setNext(refPointer.getNext());
		listCount--;
		return true;
	}
	public int Size()
	{
		return listCount;
	}
	public String toString()
	{
		String value =" ";
		Node<T> refPointer = head;
		if(refPointer.getData() == null)
			refPointer = refPointer.getNext();
		while( refPointer != null)
		{
			value = value + refPointer.getData().toString()+"-->";
			refPointer = refPointer.getNext();
		}
		return value;
	}
}
class GetNthNode
{
	public static void main(String[] args)
	{
		GetNthNode g1 = new GetNthNode();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
//		list1.add(10,1);
//		list1.add(20,2);
//		list1.add(30,3);
//		list1.add(40,4);
		list1.addNode(10);
		list1.addNode(20);
		list1.addNode(30);
		list1.addNode(40);
		System.out.println(list1.toString());
//		System.out.println(g1.reverseList(list1).toString());
		g1.reverseListRecursive(list1);
		System.out.println(list1.toString());
	}
	/**
	 * Reversing a list (Iterative) - Get each node and make the entire list point to that node 
	 * and do it recursively until the list ends
	 * @param list1
	 * @return 
	 */
	public LinkedList<Integer> reverseList(LinkedList<Integer> list1) {
		Node<Integer> prev = null;
		Node<Integer> next = null;
		Node<Integer> current = list1.getHead().getNext();
		while(current != null)
		{
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}		
		list1.setHead(prev);
		return list1;
	}
	/**
	 * Reversing a list (Recursive) - Get each node and make the entire list point to that node 
	 * and do it recursively until the list ends
	 * @param list1
	 * @return 
	 */
	public void reverseListRecursive(LinkedList<Integer> list1) {
		Node<Integer> first = list1.getHead();
		if(first == null)
		{
			return;
		}
		Node<Integer> rest = first.getNext();
		if(rest == null)
		{
			return;
		}
		list1.setHead(rest);
	    reverseListRecursive(list1);
	    first.getNext().setNext(first);
	    list1.setHead(rest);
		
	}
}