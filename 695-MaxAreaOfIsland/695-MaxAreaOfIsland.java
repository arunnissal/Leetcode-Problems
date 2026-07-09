// Last updated: 7/9/2026, 10:13:53 AM
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vist = new boolean[n][m];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vist[i][j] && grid[i][j] == 1) {
                    int newAnswer = dfs(grid, i, j, vist);
                    answer = Math.max(answer, newAnswer);
                }
            }
        }
        return answer;
    }

    // DFS function to calculate area of one island
    private int dfs(int[][] grid, int i, int j, boolean[][] vist) {
        // Boundary & base conditions
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }
        if (vist[i][j] || grid[i][j] == 0) {
            return 0;
        }

        // Mark as visited
        vist[i][j] = true;

        int area = 1; // current cell

        // Explore all 4 directions
        area += dfs(grid, i + 1, j, vist); // down
        area += dfs(grid, i - 1, j, vist); // up
        area += dfs(grid, i, j + 1, vist); // right
        area += dfs(grid, i, j - 1, vist); // left

        return area;
    }
}
