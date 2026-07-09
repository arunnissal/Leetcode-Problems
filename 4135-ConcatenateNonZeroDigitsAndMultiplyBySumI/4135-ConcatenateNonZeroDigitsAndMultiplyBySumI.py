# Last updated: 7/9/2026, 10:12:57 AM
class Solution(object):
    def sumAndMultiply(self, n):
        s,temp=0,n
        res=0
        while temp>0:
            rem=temp%10
            if rem!=0:
                res=res*10+rem
                s+=rem
            temp/=10
        rev=0
        while res>0:
            rem=res%10
            rev=rev*10+rem
            res/=10
        return rev*s
        