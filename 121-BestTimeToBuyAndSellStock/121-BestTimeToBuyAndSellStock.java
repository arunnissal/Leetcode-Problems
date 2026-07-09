// Last updated: 7/9/2026, 10:15:10 AM
class Solution {
    public int maxProfit(int[] prices) {
        int l=prices[0];
        int r=1;
        int ans=0;
        while(r<prices.length){
            if(prices[r]>l){
                int profit=prices[r]-l;
                ans=Math.max(ans,profit);
            }else{
                l=prices[r];
            }
            r++;
        }
        return ans;
    }
}