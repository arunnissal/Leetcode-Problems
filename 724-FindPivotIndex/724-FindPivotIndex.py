# Last updated: 7/9/2026, 10:13:50 AM
class Solution(object):
    def pivotIndex(self, nums):
        a=sum(nums)
        left=0
        for i in range(len(nums)):
            right=a-left-nums[i]
            if left==right:
                return i
            left+=nums[i]
        return -1