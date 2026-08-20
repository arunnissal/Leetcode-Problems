// Last updated: 8/20/2026, 9:02:25 PM
1class Solution {
2    public int trap(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5
6        int leftMax = 0;
7        int rightMax = 0;
8        int water = 0;
9
10        while (left < right) {
11
12            if (height[left] < height[right]) {
13
14                if (height[left] >= leftMax) {
15                    leftMax = height[left];
16                } else {
17                    water += leftMax - height[left];
18                }
19
20                left++;
21
22            } else {
23
24                if (height[right] >= rightMax) {
25                    rightMax = height[right];
26                } else {
27                    water += rightMax - height[right];
28                }
29
30                right--;
31            }
32        }
33
34        return water;
35    }
36}