// Last updated: 7/24/2026, 2:27:33 PM
1class Solution {
2
3    public int uniqueXorTriplets(int[] nums) {
4        if(nums.length == 1) return 1;
5
6        int m = 0;
7        for (int v : nums) {
8            m = Math.max(m, v);
9        }
10        int u = 1;
11        while (u <= m) {
12            u <<= 1;
13        }
14        boolean[] one = new boolean[u];
15        boolean[] two = new boolean[u];
16        boolean[] three = new boolean[u];
17        for (int v : nums) {
18            one[v] = true;
19            for (int x = 0; x < u; x++) {
20                if (one[x]) {
21                    two[x ^ v] = true;
22                }
23            }
24        }
25        for (int v : nums) {
26            for (int x = 0; x < u; x++) {
27                if (two[x]) {
28                    three[x ^ v] = true;
29                }
30            }
31        }
32        int ans = 0;
33        for (boolean b : three) {
34            if (b) {
35                ans++;
36            }
37        }
38        return ans;
39    }
40}