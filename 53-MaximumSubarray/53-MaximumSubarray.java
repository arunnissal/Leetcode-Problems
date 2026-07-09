// Last updated: 7/9/2026, 10:15:48 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int max_sum=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
            max_sum=Math.max(max_sum,dp[i]);
        }
        return max_sum;
    }
}