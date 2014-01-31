package OJ;

import java.util.ArrayList;
import java.util.Stack;

/**
 * push node into a stack according to 'root-right-left', pop node value from another stack according to 'left-right-root' which is post-order traversal
 * @author xiaogao
 *
 */

public class BinaryTreePostOrderTraversalIterative {

	public static ArrayList<Integer> postorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        
        Stack<TreeNode> s1 = new Stack<TreeNode>(); //store treenode
        Stack<Integer> s2 = new Stack<Integer>(); //store value
        TreeNode cur = root;
        
        while(cur != null){
        	s2.push(cur.val);
        	s1.push(cur);
        	cur = cur.right;
        }
        while(!s1.empty()){
        	cur = s1.pop();
        	cur = cur.left;
        	while(cur != null){
        		s2.push(cur.val);
        		s1.push(cur);
        		cur = cur.right;
        	}
        }
        while(!s2.empty()){
        	result.add(s2.pop());
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
		
		System.out.println(postorderTraversal(root));

	}

}
