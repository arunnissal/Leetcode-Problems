# Last updated: 7/9/2026, 10:15:59 AM
class Solution(object):
    def isValid(self, s):
        opcl = dict(('()', '[]', '{}'))
        stack = []
        for idx in s:
            if idx in '([{':
                stack.append(idx)
            elif len(stack) == 0 or idx != opcl[stack.pop()]:
                return False
        return len(stack) == 0