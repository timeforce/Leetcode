package OJ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* BST */
public class BinaryTreeLevelOrderTraversalIterative {

	public static ArrayList<Integer> levelorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
        	TreeNode cur = queue.poll();
        	if(cur.left != null)
        		queue.offer(cur.left);
        	if(cur.right != null)
        		queue.offer(cur.right);
        	result.add(cur.val);
        }
    
        return result;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		
		System.out.println(levelorderTraversal(root));

	}

}
