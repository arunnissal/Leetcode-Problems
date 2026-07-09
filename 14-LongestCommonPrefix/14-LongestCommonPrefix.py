# Last updated: 7/9/2026, 10:16:07 AM
class Solution:
    def longestCommonPrefix(self, strs):
        strs.sort()
        s = ""
        i = 0
        length = len(strs)

        while i < len(strs[0]):
            if strs[0][i] == strs[length - 1][i]:
                s += strs[0][i]
            else:
                break
            i += 1

        return s