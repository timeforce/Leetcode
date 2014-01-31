package OJ;

public class RemoveDuplicates2 {
	public static int removeDuplicates(int[] A) {  
		   int count = 0;  
		   for (int i=2; i<A.length; ++i) {  
		     if (A[i] == A[i-count-1] && A[i] == A[i-count-2]) { // skip duplicates  
		       ++count;  
		     } else if (count > 0) { // copy over non-duplicates  
		       A[i-count] = A[i];  
		     }  
		   }  
		   return A.length - count;  
		 }  

	public static void main(String[] args) {
		int[] A = {1,1,1,1, 2,2,2,2,3,3,3,3,4};
		removeDuplicates(A);
		for (int n : A)
		{System.out.println(n);}

	}

}
