package OJ;

import java.util.Stack;

public class FlattenBinaryTreeToLinkedListIterative {
	public static void flatten(TreeNode root) {  
		   TreeNode cur = root;  
		   Stack<TreeNode> rtrees = new Stack<TreeNode>();  
		   while (cur != null) {  
		     if (cur.left != null) {  
		       if (cur.right != null) rtrees.push(cur.right);  
		       cur.right = cur.left;  
		       cur.left = null;  
		     }  
		     if (cur.right == null && !rtrees.isEmpty()) {  
		       cur.right = rtrees.pop();  
		     }  
		     cur = cur.right;  
		   }  
		 }  
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(3);
		
		flatten(root);

	}

}
