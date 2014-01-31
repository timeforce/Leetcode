package OJ;

import java.util.ArrayList;


public class BinaryTreeInOrderTraversalRecursive {
	 public static ArrayList<Integer> inorderTraversal(TreeNode root) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        if(root == null){
	            return result;
	        }
	        
	        if(root.left != null)
	        	result.addAll(inorderTraversal(root.left));
	        
	        result.add(root.val);
	        
	        if(root.right != null)
	        	result.addAll(inorderTraversal(root.right));
	        
	        return result;
	    
	        
	    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(6);
		
		System.out.println(inorderTraversal(root));
	}

}
