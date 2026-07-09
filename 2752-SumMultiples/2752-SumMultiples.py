# Last updated: 7/9/2026, 10:13:07 AM
class Solution(object):
    def sumOfMultiples(self, n):
        sums=0
        for i in range(3,n+1):
            if i%3==0 or i%5==0 or i%7==0:
                sums+=i
        return sums