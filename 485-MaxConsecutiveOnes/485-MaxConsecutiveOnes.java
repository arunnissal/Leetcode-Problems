// Last updated: 8/20/2026, 9:54:57 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int max=0;
4        int i=0;
5        int count=0;
6        while(i<nums.length){
7            
8            if(nums[i]==1){
9                count++;
10                max=Math.max(max,count);
11            }else{
12                count=0;
13            }
14            i++;
15        }
16        return max;
17    }
18}