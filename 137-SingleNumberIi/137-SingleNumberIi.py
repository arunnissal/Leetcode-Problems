# Last updated: 7/9/2026, 10:15:07 AM
class Solution(object):
    def singleNumber(self, nums):
        for i in nums:
            if(nums.count(i)==1):
                return i
        