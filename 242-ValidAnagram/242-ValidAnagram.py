# Last updated: 7/9/2026, 10:14:29 AM
class Solution(object):
    def isAnagram(self, s, t):
        return sorted(s)==sorted(t)
        