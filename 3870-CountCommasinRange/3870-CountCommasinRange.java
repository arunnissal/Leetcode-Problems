// Last updated: 9/8/2026, 9:08:39 AM
class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        return n - 999;
    }
}