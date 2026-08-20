// Last updated: 8/20/2026, 9:19:30 PM
1class Solution {
2    public int mySqrt(int x) {
3        if(x<2) return x;
4        int i=1,j=x/2;
5        while(i<=j){
6            int mid=i+(j-i)/2;
7            long sq=(long)mid*mid;
8            if(sq==x) return mid;
9            else if(sq>x) j=mid-1;
10            else i=mid+1;
11        }
12        return j;
13    }
14}