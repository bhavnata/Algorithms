package Lists;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
	/**
	 *	 @param numbers
	 */
	public static ListNode add (int[] numbers){
		ListNode head = null;
		for(int i=0;i<numbers.length;i++){
			ListNode newNode = new ListNode(numbers[i]);
			if(head == null)
				head = newNode;
			else{
				ListNode prev = head;
				while(prev.next != null)
					prev=prev.next;
				prev.next = newNode;
			}
		}
		return head;
	}
	public static void printList(ListNode head){
		while(head != null)
		{
			System.out.print(head.val+" ");
			head = head.next;
		}
		System.out.println();
	}
}
