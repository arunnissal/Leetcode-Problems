# Last updated: 7/9/2026, 10:15:34 AM
class Solution(object):
    def plusOne(self, digits):
        a=int("".join(map(str,digits)))
        a=a+1
        d=list(map(int,str(a)))   
        return d