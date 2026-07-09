# Last updated: 7/9/2026, 10:15:50 AM
class Solution(object):
    def searchInsert(self, nums, target):
        for i in range(len(nums)):
            if nums[i]<target:
                continue
            else:
                return i
        return i+1