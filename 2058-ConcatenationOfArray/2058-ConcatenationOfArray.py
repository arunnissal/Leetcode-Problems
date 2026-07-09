# Last updated: 7/9/2026, 10:13:13 AM
class Solution(object):
    def getConcatenation(self, nums):
        a=len(nums)
        for i in range(a):
            nums.append(nums[i])
        return nums