// Last updated: 7/9/2026, 10:14:07 AM
public class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) return 0;
        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0 ; j < grid[0].length ; j++){
                if (grid[i][j] == 1) {
                    return getPerimeterDfs(grid,i,j);
                }
            }
        }
        return 0;
    }
    public int getPerimeterDfs(int[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {return 1;}
        if (grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) return 0;
        int count = 0;
        grid[i][j] = -1;
        count =count+getPerimeterDfs(grid, i-1, j);
        count =count+getPerimeterDfs(grid, i, j-1);
        count =count+getPerimeterDfs(grid, i, j+1);
        count =count+getPerimeterDfs(grid, i+1, j);
        return count;        
    }
}