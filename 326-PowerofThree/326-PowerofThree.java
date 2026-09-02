// Last updated: 9/2/2026, 8:58:22 AM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if (n<=0){
4            return false;
5        }
6        while(n%3==0){
7            n=n/3;
8        }
9        return n==1;
10    }
11}