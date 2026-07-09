# Last updated: 7/9/2026, 10:14:52 AM
class Solution:
    def dfs(self, i, j, m, n, grid):
        if i < 0 or i >= m or j < 0 or j >= n or grid[i][j] != '1':
            return
        grid[i][j] = '#'

        self.dfs(i - 1, j, m, n, grid)
        self.dfs(i, j - 1, m, n, grid)
        self.dfs(i + 1, j, m, n, grid)
        self.dfs(i, j + 1, m, n, grid)

    def numIslands(self, grid):
        ans, m, n = 0, len(grid), len(grid[0])
        for i in range(m):
            for j in range(n):
                if grid[i][j] == '1':
                    self.dfs(i, j, m, n, grid)
                    ans += 1
        return ans