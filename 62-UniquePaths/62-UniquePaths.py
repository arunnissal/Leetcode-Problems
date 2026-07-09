# Last updated: 7/9/2026, 10:15:38 AM
class Solution:
    def uniquePaths(self, m, n):
        dp = [[1]*n for _ in range(m)]
        
        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i-1][j] + dp[i][j-1]
        
        return dp[m-1][n-1]
