package OJ;

import java.util.Arrays;

public class ValidSudoku {
	
	
	   private static boolean isValid(char[] block) {  
	        boolean[] numbers = new boolean[9];  
	        for (Character c : block) {  
	            if (c == '.') continue;  
	            if (!(c >= '1' || c <= '9') || numbers[c-'1']) return false;  
	            numbers[c - '1'] = true;  
	        }  
	        return true;  
	    }  

	public static boolean isValidSudoku(char[][] board) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(board.length != 9) return false;
        if(board[0].length != 9) return false;
        
        for(int i = 0; i < 9; ++i){
            char[] row = Arrays.copyOf(board[i], 9);
            if(!isValid(row)) return false;
        }
        
        for(int i = 0; i < 9; ++i){
            char[] column = new char[9];
            for(int j = 0; j < 9; ++j){
                column[j] = board[i][j];
            }
            if(!isValid(column)) return false;
        }
        
        for (int i = 0; i < 3; ++i){
            for (int k = 0; k < 9; k+=3){
                char[] box = new char[9];
                for(int j = 0; j < 3; ++j){
                    System.arraycopy(board[i*3+j], k, box, j*3, 3);
                    if(!isValid(box)) return false;
                }
            }
        }
        return true;
    }
    
 
	public static void main(String[] args) {
		char[][] board = {{'5','3','.','.','7','.','.','.','.'},
				          {'6','.','.','1','9','5','.','.','.'},
				          {'.','9','8','.','.','.','.','6','.'},
				          {'8','.','.','.','6','.','.','.','3'},
				          {'4','.','.','8','.','3','.','.','1'},
				          {'7','.','.','.','2','.','.','.','6'},
				          {'.','6','.','.','.','.','2','8','.'},
				          {'.','.','.','4','1','9','.','.','5'},
				          {'.','.','.','.','8','.','.','7','9'}
				          };
		isValidSudoku(board);	
		

	}

}
