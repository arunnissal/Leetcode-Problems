// Last updated: 10/21/2026, 9:02:29 PM
1class Solution {
2public:
3    int maxSubarraySumCircular(vector<int>& A) {
4        int total_sum=0,curr_sum1=0,curr_sum2=0,mxsum_subary=INT_MIN,minsum_subary=INT_MAX;   
5        for(auto i:A)
6        {
7            total_sum+=i; curr_sum1+=i; curr_sum2+=i;
8            mxsum_subary=max(mxsum_subary,curr_sum1);
9            if(curr_sum1<0) curr_sum1=0;
10           minsum_subary=min(curr_sum2,minsum_subary);
11            if(curr_sum2>0) curr_sum2=0;
12        }
13        return (total_sum==minsum_subary)?mxsum_subary:max(mxsum_subary,total_sum-minsum_subary);  
14    }
15};