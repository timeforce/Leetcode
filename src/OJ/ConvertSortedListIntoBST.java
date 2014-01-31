package OJ;

public class ConvertSortedListIntoBST {

	 public static TreeNode sortedListToBST(ListNode head) {  
		   // calculate list length  
		   int len = 0; ListNode cur = head;  
		   while (cur!=null) {  
		       cur = cur.next;  
		       len++;  
		    }  
		    // build the BST  
		    return listToBST(head, 0, len-1);  
		  }  
		    
		  private static TreeNode listToBST(ListNode head, int low, int high) {  
		     if (low > high) return null;  
		     int mid = low + (high - low) / 2;  
		     // build up tree recursively  
		     TreeNode left = listToBST(head, low, mid-1);  
		     TreeNode root = new TreeNode(head.val);  
		     root.left = left;  
		     // Java pass in Object by reference, so we can't change head but we can change its content :)  
		     if (head.next != null) { // "move to next"  
		       head.val = head.next.val;  
		       head.next = head.next.next;  
		      root.right = listToBST(head, mid+1, high);  
		    }  
		     return root;  
		  }  
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		System.out.println(sortedListToBST(head));

	}

}
