// Last updated: 8/20/2026, 9:37:52 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left=1,right=0;
4        for(int pile:piles){
5            right=Math.max(right,pile);
6        }
7        while(left<right){
8            int mid=(left+right)/2;
9            long hours=0;
10            for(int pile:piles){
11                hours+=(pile+mid-1)/mid;
12            }
13            if(hours<=h) right=mid;
14            else left=mid+1;
15        }
16        return left;
17    }
18}