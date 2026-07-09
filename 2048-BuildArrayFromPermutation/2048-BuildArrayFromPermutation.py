# Last updated: 7/9/2026, 10:13:16 AM
class Solution(object):
    def buildArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        b=[]
        for i in nums:
            b.append(i)
        for i in range(len(nums)):
            nums[i]=b[nums[i]]
        return nums
        