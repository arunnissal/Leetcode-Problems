# Last updated: 7/9/2026, 10:14:32 AM
class Solution(object):
    def findDuplicate(self, nums):
        nums.sort()
        i,j=0,1
        while j<len(nums):
            if nums[i]==nums[j]:
                return nums[i]
            i+=1
            j+=1
                    