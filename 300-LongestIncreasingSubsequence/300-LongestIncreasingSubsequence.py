# Last updated: 7/9/2026, 10:14:22 AM
class Solution:
    def lengthOfLIS(self, nums):
        n = len(nums)
        dp = [1] * n
        
        for i in range(n):
            for j in range(i):
                if nums[j] < nums[i]:
                    dp[i] = max(dp[i], dp[j] + 1)
        
        return max(dp)
