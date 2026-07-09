# Last updated: 7/9/2026, 10:15:03 AM
class Solution(object):
    def singleNumber(self, nums):
        ans=0
        for i in nums:
            ans^=i
        return ans