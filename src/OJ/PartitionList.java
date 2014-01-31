package OJ;

public class PartitionList {

	 public static ListNode partition(ListNode head, int x) {  
		 //ListNode dummy = new ListNode(0);  
		 //dummy.next = head;  
		     
		 // find the last node that < x  
		 //ListNode last = dummy;  
		 ListNode last = head;
		 while (last.next != null && last.next.val < x) last = last.next;  
		     
		 // start from the >=x node  
		 ListNode nt = last;  
		 while (nt.next != null) {  
			 if (nt.next.val < x) {  
				 ListNode tmp = nt.next;  
		    	 nt.next = tmp.next;  
		    	 tmp.next = last.next;  
		    	 last.next = tmp;  
		         last = last.next;  
		     } else {  
		         nt = nt.next;  
		     }  
		 }  
		     
		 //return dummy.next;
		 return head;
    }  
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(2);
		
		while(head != null){
			System.out.println(partition(head, 3).val);
			head = head.next;
		}

	}

}
