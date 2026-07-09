// Last updated: 7/9/2026, 10:15:08 AM
class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        for(int i=1;i<prices.length;i++){
            if (prices[i]>prices[i-1]){
                p+=prices[i]-prices[i-1];
            }
        }
        return p;
    }
}