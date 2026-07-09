// Last updated: 7/9/2026, 10:14:34 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int c=n&(n-1);
        if(c==0) return true;
        return false;
    }
}