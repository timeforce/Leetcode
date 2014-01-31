package OJ;

public class RemoveElemfromArray {

	public static int removeElement(int[] A, int elem) {  
		   int count = 0;  
		   for (int i=0; i<A.length; ++i) {  
		     if (A[i] == elem) { // find one, skip  
		       ++count;  
		     } else if (count > 0) { // copy over  
		       A[i-count] = A[i];  
		     }  
		   }  
		   return A.length - count;  
	}  
	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		removeElement(A, 1);
	}

}
