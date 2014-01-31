package OJ;

public class MinimumPathSum {

	public static int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int rows = grid.length;

        int cols = grid[0].length;

        if (rows == 0 || cols == 0) return 0;

        int[] path = new int[cols];

        for (int i=0; i<rows; i++) {

            for (int j=0; j<cols; j++) {

                if (j > 0 && i > 0) {   

                    path[j] = grid[i][j] + Math.min(path[j-1], path[j]);

                } else if (j == 0) {

                    path[j] = grid[i][j] + path[j];

                } else {
                //i=0
                    path[j] = grid[i][j] + path[j-1];
                }

            } 
        
        }
        return path[cols-1];
   


    }
	public static void main(String[] args) {
		int[][]grid = {{1,2,3},{4,5,6}};
		System.out.println(grid);
		System.out.println(minPathSum(grid));

	}

}
