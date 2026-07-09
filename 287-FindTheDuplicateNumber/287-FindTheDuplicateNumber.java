// Last updated: 7/9/2026, 10:14:26 AM
class Solution {
    public int findDuplicate(int[] nums) {
        int i=0,j=1;
        Arrays.sort(nums);
        while (j<nums.length){
            if (nums[i]==nums[j]){
                return nums[i];
            }
                
            i+=1;
            j+=1;
        }
            
        return 0;
    }
}