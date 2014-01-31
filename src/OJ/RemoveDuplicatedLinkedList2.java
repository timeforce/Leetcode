package OJ;

public class RemoveDuplicatedLinkedList2 {

	 public static ListNode deleteDuplicates(ListNode head) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        ListNode cur = head;
	        ListNode pre = null;
	        while(cur != null){
	            while(pre != null && pre.val == cur.val){
	                cur = cur.next;
	                if(pre.val != cur.val){
	                    pre.next = cur;
	                }
	            }
	            
	            pre = cur;
	            cur = cur.next;
	        }
	        return head;
	    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(3);
		
		System.out.println(deleteDuplicates(head));

	}

}
