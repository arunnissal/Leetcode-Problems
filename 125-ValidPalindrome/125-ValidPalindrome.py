# Last updated: 7/9/2026, 10:15:06 AM
class Solution(object):
    def isPalindrome(self, s):
        a=list(map(str,str(s)))
        b=[]
        for i in a:
            if i.isalnum():
                b.append(i.lower())
        c=''.join(b)
        return c==c[::-1]
        