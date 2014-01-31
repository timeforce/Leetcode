package OJ;

import java.util.ArrayList;
import java.util.Arrays;

public class Threesum {

	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
		ArrayList<ArrayList<Integer>> resSet = new ArrayList<ArrayList<Integer>>();
        if(num.length < 3) return resSet;
        Arrays.sort(num);
        for(int i = 0; i < num.length; i++){
            if(i > 0 && num[i] == num[i-1]) continue;//w/o this condition, [0,0,0,0] -> output: [0,0,0],[0,0,0]
            int j = i + 1;
            int k = num.length - 1;
            while(j < k){
                int sum_two = num[i] + num[j];
                if(sum_two + num[k] < 0){
                    j++;
                }else if(sum_two + num[k] > 0){
                    k--;
                }else{
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    res.add(num[i]);
                    res.add(num[j]);
                    res.add(num[k]);
                    resSet.add(res);
                    do{j++;} while(j < k && num[j] == num[j-1]);
                    do{k--;} while(j < k && num[k] == num[k+1]);
                }
            }
        }
        return resSet;
    }
	public static void main(String[] args) {
		int[] num = {0,0,0,0};
		System.out.println(threeSum(num));

	}

}
