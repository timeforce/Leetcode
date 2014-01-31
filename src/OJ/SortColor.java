package OJ;

public class SortColor {
	private static final int RED = 0;  
	 private static final int WHITE = 1;  
	 private static final int BLUE = 2;  
	   
	 private static void swap(int[] A, int l, int r) {  
	   int temp = A[l];  
	   A[l] = A[r];  
	   A[r] = temp;  
	 }  
	   
	 public static void sortColors(int[] colors) {  
	   // initialize cur pointers  
	   int cur = 0;  
	   // red is the next position for reds; blue is the next position for blues  
	   int red = 0, blue = colors.length - 1;  
	   //  
	   while (cur <= blue) {  
	     if (colors[cur] == RED) {  
	       swap(colors, cur++, red++);  
	     } else if (colors[cur] == BLUE) {  
	       swap(colors, cur, blue--);  
	     } else {  
	       ++cur;  
	     }  
	   }  
	 }  

	public static void main(String[] args) {
		int[] colors = {0,0,1,2,1,2,1,1};
		sortColors(colors);
		

	}

}
