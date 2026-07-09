# Last updated: 7/9/2026, 10:13:04 AM
class Solution(object):
    def numberOfPairs(self, points):
        n = len(points)

        # recursion to check if rectangle is empty
        def check(i, j, k):
            if k == n:
                return True
            
            if k != i and k != j:
                x1, y1 = points[i]
                x2, y2 = points[j]
                x, y = points[k]

                if x1 <= x <= x2 and y2 <= y <= y1:
                    return False

            return check(i, j, k + 1)

        # recursion to iterate j
        def solve_j(i, j):
            if j == n:
                return 0

            count = 0
            if i != j:
                x1, y1 = points[i]
                x2, y2 = points[j]

                if x1 <= x2 and y1 >= y2:
                    if check(i, j, 0):
                        count = 1

            return count + solve_j(i, j + 1)

        # recursion to iterate i
        def solve_i(i):
            if i == n:
                return 0

            return solve_j(i, 0) + solve_i(i + 1)

        return solve_i(0)
        