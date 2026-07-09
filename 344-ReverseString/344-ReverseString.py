# Last updated: 7/9/2026, 10:14:14 AM
class Solution(object):
    def reverseString(self, s):
        def helper(left,right):
            if left>=right:
                return 
            s[left],s[right]=s[right],s[left]
            helper(left+1,right-1)
        helper(0,len(s)-1)