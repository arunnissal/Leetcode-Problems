# Last updated: 7/9/2026, 10:12:59 AM
class Solution(object):
    def mirrorDistance(self, n):
        rev=0
        temp=n
        while(temp>0):
            rem=temp%10
            rev=rev*10+rem
            temp/=10
        return abs(n-rev)
        