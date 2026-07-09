# Last updated: 7/9/2026, 10:14:01 AM
class Solution(object):
    def subarraySum(self, nums, k):
        sum = 0
        count = 0
        map = defaultdict(int)
        map[0] = 1

        for num in nums:
            sum += num
            rem = sum - k

            if rem in map:
                count += map[rem]
            map[sum] += 1

        return count
        