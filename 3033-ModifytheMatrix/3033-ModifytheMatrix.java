// Last updated: 8/20/2026, 3:03:04 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0,j=1;
4        while(j<nums.length){
5            if(nums[i]!=nums[j]){
6                i++;
7                nums[i]=nums[j];
8            }
9            j++;
10        }
11        return i+1;
12    }
13}