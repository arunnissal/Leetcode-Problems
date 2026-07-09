// Last updated: 7/9/2026, 10:15:28 AM
class Solution {
    public int mySqrt(int x) {
        if (x<2) return x;
        int l=1,r=x/2;
        while (l<=r) {
            long mid=l+(r-l)/2;
            long sq=mid*mid;
            if(sq==x) return (int)mid;
            else if (sq<x) l=(int)mid+1;
            else r=(int)mid-1;
        }
        return r;  // floor value
    }
}