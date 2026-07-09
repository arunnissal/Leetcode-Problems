# Last updated: 7/9/2026, 10:13:02 AM
class Solution(object):
    def minMoves(self, nums):
        return max(nums)*len(nums)-sum(nums)