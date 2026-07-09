# Last updated: 7/9/2026, 10:14:28 AM
class Solution(object):
    def addDigits(self, num):
        sum=0
        while num>9:
            sum=num%10
            num=num/10
            num+=sum
        return num
        