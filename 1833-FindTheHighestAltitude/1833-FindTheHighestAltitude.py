# Last updated: 7/9/2026, 10:13:18 AM
class Solution(object):
    def largestAltitude(self, gain):
        a=[]
        a.append(0)
        for i in range(len(gain)):
            a.append(a[i]+gain[i])
        return max(a)
        