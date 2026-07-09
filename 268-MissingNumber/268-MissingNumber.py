# Last updated: 7/9/2026, 10:14:23 AM
class Solution(object):
    def missingNumber(self, nums):
        nums.sort()
        a=0
        for i in nums:
            if a==i:
                a+=1
                continue
            break
        return a
        