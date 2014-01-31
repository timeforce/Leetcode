package OJ;

public class JumpGame2 {

	public static int jump(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
      int steps = 0;
      for(int i = 0, max = 0, next = 0; i < A.length - 1 && next < A.length - 1; ++i){
          max = Math.max(max, i + A[i]);
          if(i == next){
              if(max == next) return -1;
              next = max;
              ++steps;
          }
      }
      return steps;
    }
	public static void main(String[] args) {
		int[] A = {2,3,1,1,4};
		System.out.println(jump(A));

	}

}
