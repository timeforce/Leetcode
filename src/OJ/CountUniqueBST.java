package OJ;

public class CountUniqueBST {

	public static int numTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return helper(1,n);
    }  
    
    private static int helper(int start, int end){
        if (start >= end) return 1;
        
        int result = 0;
        
        for(int i = start; i <= end; i++){
            result += helper(start, i-1) * helper(i+1, end);
        }
        return result;
    }  
	public static void main(String[] args) {
		System.out.println(numTrees(4));

	}

}
