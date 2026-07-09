# Last updated: 7/9/2026, 10:14:09 AM
class Solution(object):
    def findDuplicates(self, nums):
        seen = set()
        duplicates = []
        
        for num in nums:
            if num in seen:
                duplicates.append(num)
            else:
                seen.add(num)
                
        return duplicates