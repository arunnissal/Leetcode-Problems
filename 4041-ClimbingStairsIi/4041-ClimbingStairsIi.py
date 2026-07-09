# Last updated: 7/9/2026, 10:13:00 AM
class Solution(object):
    def climbStairs(self, n, costs):
        # dp[i] = minimum cost to reach step i
        dp = [float('inf')] * (n + 1)
        dp[0] = 0
        
        for i in range(1, n + 1):
            for jump in (1, 2, 3):
                prev = i - jump
                if prev >= 0:
                    dp[i] = min(
                        dp[i],
                        dp[prev] + costs[i - 1] + jump * jump
                    )
        
        return dp[n]
