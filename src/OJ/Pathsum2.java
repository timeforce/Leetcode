package OJ;

import java.util.*;
public class Pathsum2 {

	public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> resSet = new ArrayList<ArrayList<Integer>>();  
        findPathSum(root, sum, new ArrayList<Integer>(), resSet);  
        return resSet;  
    }
    private static void findPathSum(TreeNode root, int sum,  ArrayList<Integer> path,  ArrayList<ArrayList<Integer>> resSet) {  
        if (root == null) return;  
        path.add(root.val);  
        if (root.left == null && root.right == null) { // get to a leaf 
            if (sum == root.val) { // found a path 
       // has to make a copy, otherwise the content may be changed  
                ArrayList<Integer> curPath = new ArrayList<Integer>(path);  
                resSet.add(curPath);  
            }  
        }  
        findPathSum(root.left, sum - root.val, path, resSet);  
        findPathSum(root.right, sum - root.val, path, resSet);  
        path.remove(path.size()-1);  
    }  
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);
		
		System.out.println(pathSum(root, 1));
	}

}


