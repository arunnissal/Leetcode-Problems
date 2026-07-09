// Last updated: 7/9/2026, 10:14:05 AM
class Solution{
    public int findTargetSumWays(int[] nums,int target){
        int S=0;
        for(int n:nums)S+=n;
        if(Math.abs(target)>S||(S+target)%2!=0)return 0;
        int P=(S+target)/2;
        int[] dp=new int[P+1];
        dp[0]=1;
        for(int n:nums){
            for(int s=P;s>=n;s--){
                dp[s]+=dp[s-n];
            }
        }
        return dp[P];
    }
}
