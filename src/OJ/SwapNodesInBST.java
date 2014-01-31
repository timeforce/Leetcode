package OJ;

public class SwapNodesInBST {

	    public static void recoverTree(TreeNode root) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        TreeNode[] nodes = new TreeNode[2];
	        inorder(root, nodes, null);
	        swap(nodes[0], nodes[1]);
	      
	    }  
	    
	    private static TreeNode inorder(TreeNode root, TreeNode[] nodes, TreeNode pre){
	        if(root == null) return pre;
	        
	        TreeNode last = inorder(root.left, nodes, pre);
	        
	        if(last != null && root.val < last.val){
	            nodes[1] = root;
	            if(nodes[0] == null){
	                nodes[0] = last;
	            }else {
	                return root;
	            }
	        }
	        
	        return inorder(root.right, nodes, root);
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
		
		recoverTree(root);
		

	}

}
