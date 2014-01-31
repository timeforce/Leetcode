package OJ;

import java.util.Arrays;

public class Threesumclosest {

	public static int threeSumClosest(int[] num, int target) {
		if(num.length < 3){
			return Integer.MAX_VALUE;
		}
		Arrays.sort(num);
		int res = num[0]+num[1]+num[2];
		for (int i=0; i<num.length-1; ++i) {
	        if (i>0 && num[i]==num[i-1])  continue;
	        int start = i+1, end = num.length-1;
	        while (start<end) {
	            int sum = num[i] + num[start] + num[end];
	            if (Math.abs(sum-target) < Math.abs(res-target)) {
	                res = sum;
	            }
	            else if (sum < target) {
	                start++;
	            } else {
	                end--;
	            }
	        }//end-while
	    }
	    return res;
	}
	public static void main(String[] args) {
		int[] num = {1,2,3};
		System.out.println(threeSumClosest(num, 6));

	}

}
