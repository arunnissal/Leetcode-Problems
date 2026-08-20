// Last updated: 8/20/2026, 9:17:13 PM
1class Solution {
2    public int search(int[] a, int target) {
3        int left=0,right=a.length-1;
4        while(left<=right){
5            int mid=(left+right)/2;
6            if(a[mid]==target){
7                return mid;
8            }else if(a[mid]>target){
9                right=mid-1;
10            }else{
11                left=mid+1;
12            }
13        }
14        return -1;
15    }
16}