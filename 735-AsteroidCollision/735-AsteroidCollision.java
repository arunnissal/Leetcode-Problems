// Last updated: 8/28/2026, 10:19:24 AM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3
4        Stack<Integer> st = new Stack<>();
5
6        for(int i : asteroids) {
7
8            boolean alive = true;
9
10            while(alive && !st.isEmpty() && st.peek() > 0 && i < 0) {
11
12                if(st.peek() < -i) {
13                    st.pop();
14                }
15                else if(st.peek() == -i) {
16                    st.pop();
17                    alive = false;
18                }
19                else {
20                    alive = false;
21                }
22            }
23
24            if(alive) {
25                st.push(i);
26            }
27        }
28
29        int[] arr = new int[st.size()];
30        int a = 0;
31
32        for(Integer i : st) {
33            arr[a] = i;
34            a++;
35        }
36
37        return arr;
38    }
39}