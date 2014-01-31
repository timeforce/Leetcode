package OJ;

import java.util.Stack;
import OJ.TreeNode;

public class MaxDepthBinaryTree {

	public static int maxDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
		if(root == null) return 0;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        int depth = 0;
        TreeNode prev = null;
        
        while(!s.isEmpty()){
            TreeNode current = s.peek();
            
            if(prev == null || prev.left == current || prev.right == current){
                if(current.left != null){
                    s.push(current.left);
                } else if(current.right != null){
                    s.push(current.right);
                }
            } else if(prev == current.left){
                if(current.right != null){
                    s.push(current.right);
                }
            } else {
                s.pop();
            }
            prev = current;
            if(depth < s.size()){
                depth = s.size();
            }
        }
        return depth;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		
		System.out.println(maxDepth(root));
		

	}

}
