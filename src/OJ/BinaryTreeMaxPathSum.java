package OJ;

import java.util.ArrayList;


public class BinaryTreeMaxPathSum {


	public static int maxPathSum(TreeNode root) {
	    ArrayList<Integer> maxSum = new ArrayList<Integer>(1);
	    maxSum.add(Integer.MIN_VALUE);
	    getMaxSum(root,maxSum);
	    return maxSum.get(0);
	}

	public static int getMaxSum(TreeNode root,ArrayList<Integer> maxSum){
	    if(root==null){
	        return 0;
	    }

	    int leftSum=0,rightSum=0;
	    leftSum = getMaxSum(root.left,maxSum);
	    rightSum = getMaxSum(root.right,maxSum);

	    int curSum = Math.max(root.val,Math.max(root.val+leftSum,root.val+rightSum));
	    maxSum.add(0,Math.max(maxSum.get(0), Math.max(curSum,root.val+leftSum+rightSum)));
	    return curSum;
	}
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(-1);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		System.out.println(maxPathSum(root));
		
		

	}

}
