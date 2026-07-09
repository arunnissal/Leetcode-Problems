# Last updated: 7/9/2026, 10:15:31 AM
class Solution(object):
    def addBinary(self, a, b):
        return bin(int(a,2)+int(b,2))[2:]
        