# Last updated: 7/9/2026, 10:14:51 AM
class Solution(object):
    def majorityElement(self, nums):
        sol = None
        c = 0
        for i in nums:
            if c == 0:
                sol = i
            c += (1 if i == sol else -1)
        return sol