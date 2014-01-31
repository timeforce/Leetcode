package OJ;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum1 {

	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {  
		   ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();  
		   Arrays.sort(candidates);  
		   addUp(candidates, 0, target, new ArrayList<Integer>(), results);  
		   return results;  
		 }  
		   
		 private static void addUp(int[] candidates, int start, int target, ArrayList<Integer> path,  
		     ArrayList<ArrayList<Integer>> results) {  
		   if (start < 0 || target < 0) return;  
		   
		   if (0 == target) {  
		     ArrayList<Integer> res = new ArrayList<Integer>(path);  
		     results.add(res);  
		   } else {  
		     for (int i=start; i<candidates.length && candidates[i] <= target; ++i) {  
		       // if (candidates[i] > target) continue; // if we don't sort the data at the beginning, we skip large numbers here  
		       path.add(candidates[i]);  
		       addUp(candidates, i, target - candidates[i], path, results);  
		       path.remove(path.size() - 1);  
		     }  
		   }  
		 }  
	public static void main(String[] args) {
		int[] candidates = {2,3,6,7};
		System.out.println(combinationSum(candidates, 7));

	}

}
