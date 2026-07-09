# Last updated: 7/9/2026, 10:13:28 AM
class Solution:
    def divisorGame(self, n: int) -> bool:
        dp = [False] * (n + 1)
        
        # Base case
        dp[1] = False
        
        for i in range(2, n + 1):
            for x in range(1, i):
                if i % x == 0 and dp[i - x] == False:
                    dp[i] = True
                    break
        
        return dp[n]
