// Last updated: 8/20/2026, 9:47:02 PM
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int left=0,right=0;
4        for(int i:nums){
5            left=Math.max(left,i);
6            right+=i;
7        }
8        while(left<right){
9            int mid=(left+right)/2;
10            int day=1;
11            int cur=0;
12            for(int weigh:nums){
13                if(cur+weigh>mid){
14                    cur=weigh;
15                    day++;
16                }else{
17                    cur+=weigh;
18                }
19            }
20            if(day<=k){
21                right=mid;
22            }else{
23                left=mid+1;
24            }
25        }
26        return left;
27    }
28
29}