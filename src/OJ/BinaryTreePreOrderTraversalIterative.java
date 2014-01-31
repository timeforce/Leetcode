package OJ;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreOrderTraversalIterative {

	public static ArrayList<Integer> preorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode cur = root;
        /*
        while(cur != null || !s.empty()){
        	if(cur != null){
        		s.push(cur);
            	result.add(cur.val);
            	cur = cur.left;
        	}else{
        		cur = s.pop();
        		cur = cur.right;
        	}
        	
        }*/
        
        while(cur != null){
        	s.push(cur);
        	result.add(cur.val);
        	cur = cur.left;
        }
        
        while(!s.empty()){
        	cur = s.pop();
        	cur = cur.right;
        	while(cur != null){
        		s.push(cur);
        		result.add(cur.val);
        		cur = cur.left;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(6);
		
		System.out.println(preorderTraversal(root));

	}

}
