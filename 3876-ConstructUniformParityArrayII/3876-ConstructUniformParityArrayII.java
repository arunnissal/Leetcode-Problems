// Last updated: 9/3/2026, 8:50:44 AM
1class Solution {
2    public boolean uniformArray(int[] nums) {
3        int smallestOdd = Integer.MAX_VALUE;
4        for (int num : nums) {
5            if (num % 2 == 1)
6                smallestOdd = Math.min(smallestOdd, num);
7        }
8        if (smallestOdd == Integer.MAX_VALUE)
9            return true;
10        for (int num : nums) {
11            if (num % 2 == 0 && num <= smallestOdd)
12                return false;
13        }
14
15        return true;
16    }
17}