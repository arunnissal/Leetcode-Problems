# Last updated: 7/9/2026, 10:13:15 AM
class Solution:
    def countGoodNumbers(self, n):
        M = 10**9+7
        even = (n+1)//2
        odd = n//2
        def power(x, y):
            if y == 0:
                return 1
            half=power(x,y//2)%M
            if y%2==0:
                return (half*half)%M
            else:
                return (half*half*x)%M
        
        return (power(5,even)*power(4,odd))%M