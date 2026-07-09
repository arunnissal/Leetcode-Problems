# Last updated: 7/9/2026, 10:15:55 AM
class Solution(object):
    def removeDuplicates(self, nums):
        j=1
        for i in range(1,len(nums)):
            if nums[i]!=nums[i-1]:
                nums[j]=nums[i]
                j+=1
        return j