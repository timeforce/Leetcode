package OJ;

public class FindRotationAmount {

	public static int FindSortedArrayRotation(int A[]){
		int low = 0;
		int high = A.length - 1;
		
		while(A[low] > A[high]){
			int mid = low + (high - low) / 2;
			if(A[mid] > A[high]){
				low = mid + 1;
			}else {
				high = mid;
			}
		}
		return low;
	}
	public static void main(String[] args) {
		int[] A = {5,1,2,3,4};
		System.out.println(FindSortedArrayRotation(A));

	}

}
