# Last updated: 7/9/2026, 10:12:56 AM
class Solution(object):
    def removeZeros(self, n):
        a=0
        while n>0:
            rem=n%10
            if rem!=0:
                a=a*10+rem
            n/=10
        res=0
        while a>0:
            rem=a%10
            res=res*10+rem
            a/=10
        return res
        