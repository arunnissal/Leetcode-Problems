# Last updated: 7/9/2026, 10:15:54 AM
class Solution(object):
    def strStr(self, haystack, needle):
        b=1
        if needle in haystack:
            a=needle[0]
            b=haystack.index(needle)
            return b
        return -1
        