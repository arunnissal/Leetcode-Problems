// Last updated: 7/9/2026, 10:13:30 AM
class Solution {
    public int longestOnes(int[] arr,int k) {
        int n=arr.length,l=0,zeros=0,max=0;
        for(int r=0;r<n;r++) {
            if(arr[r]==0) zeros++;
            while(zeros>k) {
                if(arr[l]==0) zeros--;
                l++;
            }
            if(r-l+1>max) max=r-l+1;
        }
        return max;
    }
}
