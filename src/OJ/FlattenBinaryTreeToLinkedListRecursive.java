package OJ;

public class FlattenBinaryTreeToLinkedListRecursive {
	public static TreeNode flatten(TreeNode root) {  
		   if (root == null) return root;  
		   TreeNode rtree = root.right;  
		   if (root.left != null) {  
		     root.right = root.left;  
		     root.left = null;  
		     root = flatten(root.right);  
		   }  
		   if (rtree != null) {  
		     root.right = rtree;  
		     root = flatten(root.right);  
		   }  
		   return root;  
		 }  
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(6);
		
		TreeNode res = flatten(root);
		
		System.out.println(res.val);
		

	}

}
