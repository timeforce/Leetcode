package OJ;

public class SwapNodesInBSTMorris {

	 private static void recoverMorris(TreeNode root) {  
		   TreeNode pre = null, cur = root, n1 = null, n2 = null;  
		   
		   while (cur != null) {  
		     if (cur.left != null) {  
		       TreeNode p = cur.left;  
		       while (p.right != null && p.right != cur) {  
		         p = p.right;  
		       }  
		       if (p.right == null) { // set right to successor  
		         p.right = cur;  
		         cur = cur.left;  
		       } else { // visit and revert the change  
		         p.right = null;  
		         if (pre.val > cur.val) {  
		           n2 = cur;  
		           if (n1 == null) n1 = pre;  
		         }  
		         pre = cur;  
		         cur = cur.right;  
		       }  
		     } else { // visit  
		       if (pre != null && pre.val > cur.val) {  
		         n2 = cur;  
		         if (n1 == null) n1 = pre;  
		       }  
		       pre = cur;  
		       cur = cur.right;  
		     }  
		   }  
		   swap(n1, n2);  
		 }  
	 private static void swap(TreeNode a, TreeNode b) {  
		   if (a == null || b == null)  return;
		   int tmp = a.val;  
		   a.val = b.val;  
		   b.val = tmp;  
		 }  
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(5);
		
		recoverMorris(root);

	}

}
