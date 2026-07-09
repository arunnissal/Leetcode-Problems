# Last updated: 7/9/2026, 10:15:14 AM
class Solution(object):
    def maxProfit(self, prices):
        p=0
        for i in range(1,len(prices)):
            if prices[i]>prices[i-1]:
                p+=prices[i]-prices[i-1]
        return p
        