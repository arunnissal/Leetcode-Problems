// Last updated: 9/8/2026, 9:05:36 AM
1class Solution {
2    public int countCommas(int n) {
3        return n>=1000 ? n-999 : 0;
4    }
5}