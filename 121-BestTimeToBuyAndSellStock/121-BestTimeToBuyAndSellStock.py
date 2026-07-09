# Last updated: 7/9/2026, 10:15:17 AM
class Solution(object):
    def maxProfit(self, prices):
        min,max=prices[0],0
        for i in prices:
            if(min>i):
                min=i
            if i-min > max :
                max=i-min
        return max
        