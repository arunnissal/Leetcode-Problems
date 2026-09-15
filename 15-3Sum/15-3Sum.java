// Last updated: 9/15/2026, 6:15:25 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(nums);
5        int i = 0;
6        while (i <= nums.length - 3) {
7            if (i > 0 && nums[i] == nums[i - 1]) {
8                i++;
9                continue;
10            }
11            int cur = nums[i];
12            int left = i + 1;
13            int right = nums.length - 1;
14            while (left < right) {
15                int sum = nums[left] + nums[right];
16                if (sum == -cur) {
17                    res.add(Arrays.asList(cur, nums[left], nums[right]));
18                    left++;
19                    right--;
20                    while (left < right && nums[left] == nums[left - 1]) {
21                        left++;
22                    }
23                    while (left < right && nums[right] == nums[right + 1]) {
24                        right--;
25                    }
26                } else if (sum > -cur) {
27                    right--;
28                } else {
29                    left++;
30                }
31            }
32            i++;
33        }
34        return res;
35    }
36}