package OJ;

public class RotateList {

	public static ListNode rotateRight(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null || n <= 0 || head.next == null) return head;
        
        ListNode pre = head, end = head;
        while(end.next != head || n > 0){
            if( n > 0){
                --n;
            }else{
                pre = pre.next;
            }
            end = end.next;
            if(end.next == null) end.next = head;
        }
        
        ListNode newHead = pre.next;
        pre.next = null;
        
        return newHead;
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		
		System.out.println(rotateRight(head, 6).val);


	}

}
