package Lists;


public class removeNthNode {
	public static void main(String[] args){
		int[] numbers = {1,2,3,4};
		ListNode head = ListNode.add(numbers);
		ListNode.printList(head);
		removeNthFromEnd(head,2);
		ListNode.printList(head);
	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null){ 
			return null;
		}
		else if(head.next == null && n > 1){
			return null;
		}
		else if(head.next == null && n == 1){
			return null;
		}
		ListNode prev = head;
		ListNode cur = head;
		for(int i=0;i<n;i++){
			cur = cur.next;
		}
		while(cur.next != null){
			prev = prev.next;
			cur = cur.next;
		}
		prev.next = prev.next.next;
		return head;
	}
	
}
