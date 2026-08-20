// Last updated: 8/20/2026, 3:08:23 PM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int i=0,j=0;
4        while(j<nums.length){
5            if(nums[j]!=val){
6                nums[i]=nums[j];
7                i++;
8            }
9            j++;
10        }
11        return i;
12    }
13}