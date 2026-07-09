# Last updated: 7/9/2026, 10:13:37 AM
class Solution(object):
    def sortedSquares(self, nums):
        for i in range(len(nums)):
            nums[i]=nums[i]*nums[i]
        return sorted(nums)
        