// Last updated: 7/9/2026, 10:13:29 AM
class Solution {
    
    int dir[][] = {
        { 1, 0 },
        { -1, 0 },
        { 0, 1 },
        { 0, -1 }
    };
    
    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int j = 0; j < n; j++)
        {
            if(grid[0][j] == 1)
            {
                grid[0][j] = 0;
                this.DFS(grid, 0, j);
            }

            if(grid[m - 1][j] == 1)
            {
                grid[m - 1][j] = 0;
                this.DFS(grid, m - 1, j);
            }   
        }
        
        for(int i = 0; i < m; i++)
        {
            if(grid[i][0] == 1)
            {
                grid[i][0] = 0;
                this.DFS(grid, i, 0);
            }
            
            if(grid[i][n - 1] == 1)
            {
                grid[i][n - 1] = 0;
                this.DFS(grid, i, n - 1);
            }
        }
        
        int count = 0;
        for(int i = 0; i < m-1; i++)
        {
            for(int j = 0; j < n-1; j++)
            {
                if(grid[i][j] == 1) count++;
            }
        }
        return count;
    }
    
    void DFS(int[][] grid, int r, int c)
    {
        int m = grid.length, n = grid[0].length;
        
        
        for(int d[]: this.dir)
        {
            int newr = r + d[0], newc = c + d[1];
            if(
                newr >= 0 && newr < m && 
                newc >= 0 && newc < n &&
                grid[newr][newc] == 1
            ) {
                grid[newr][newc] = 0;
                this.DFS(grid, newr, newc);
            }
        }
    }
}