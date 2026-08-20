// Last updated: 8/20/2026, 9:38:23 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left=1,right=0;
4        for(int pile:piles){
5            right=Math.max(right,pile);
6        }
7        
8        while(left<right){
9            int mid=(left+right)/2;
10            long hours=0;
11            for(int pile:piles){
12                hours+=(pile+mid-1)/mid;
13            }
14            if(hours<=h) right=mid;
15            else left=mid+1;
16
17        }
18        return left;
19    }
20}