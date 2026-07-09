# Last updated: 7/9/2026, 10:15:43 AM
class Solution:
    def canJump(self, nums):
        goal = len(nums) - 1
        for i in range(len(nums) - 2, -1, -1):
            if nums[i] + i >= goal:
                goal = i
        return goal == 0