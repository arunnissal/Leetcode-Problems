# Last updated: 7/9/2026, 10:14:36 AM
class Solution(object):
    def containsDuplicate(self, nums):
        return len(nums)!=len(set(nums))
            
        