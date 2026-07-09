# Last updated: 7/9/2026, 10:13:19 AM
class Solution(object):
    def runningSum(self, nums):
        for i in range(1, len(nums)):
            nums[i] += nums[i - 1]
        return nums