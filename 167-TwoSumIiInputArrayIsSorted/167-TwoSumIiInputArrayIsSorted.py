# Last updated: 7/9/2026, 10:14:54 AM
class Solution(object):
    def twoSum(self, numbers, target):
        i=0
        j=len(numbers)-1
        while  i<j:
            total=numbers[i]+numbers[j]
            if total==target:
                return [i+1,j+1]
            elif total>target:
                j-=1
            else:
                i+=1
        return -1

        