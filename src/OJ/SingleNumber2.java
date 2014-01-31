package OJ;

public class SingleNumber2 {

	public static int singleNumber(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int[] count = new int[32];
        int result = 0;
        for(int i = 0; i < 32; ++i){
            count[i] = 0;
            for(int j = 0; j < A.length; ++j){
                if(((A[j] >> i) & 1) == 1){
                    count[i] = (count[i] + 1) % 3;
                }
            }
            result |=(count[i] << i);
        }
        return result;
    }
	public static void main(String[] args) {
		int[] A = {1,1,1,2,3,3,3};
		System.out.println(singleNumber(A));
	}

}
