package Lists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */ 


	public class IntersectionTwoLists {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			if(headA == null || headB == null)
				return null;
			if(headA == headB)
				return headA;
			// Hold the count of the number of nodes in both the list
			int count1 = 0,count2 = 0;
			// Store the head of list1 and traverse through another pointer
			ListNode nextNode = headA;
			count1 = getCount(nextNode);
			nextNode = headB;
			count2 = getCount(nextNode);
			ListNode bigger = headA;
			ListNode smaller = headB;
			int diff=0;
			if(count1 > count2){
				diff = count1-count2;
				bigger = headA;
				smaller = headB;
			}
			else if(count2 > count1){
				diff = count2-count1;
				bigger = headB;
				smaller = headA;
			}
			int i=0;
			while(i<diff){
				bigger = bigger.next;
				i++;
			}
			while(smaller != bigger){
				smaller = smaller.next;
				bigger = bigger.next;
			}
			if(smaller != null && bigger != null){
				return smaller;
			}
			return null;
		}
		public int getCount(ListNode head){
			int count=0;
			while(head != null){
				head = head.next;
				count++;
			}
			return count;
		}
	}

