// Last updated: 8/20/2026, 6:24:50 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int current=0;
4        int maxSum=nums[0];
5        for(int i:nums){
6            if(current<0) current=0;
7            current+=i;
8            maxSum=Math.max(maxSum,current);
9        }
10        return maxSum;
11    }
12}