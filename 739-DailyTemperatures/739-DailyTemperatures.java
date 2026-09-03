// Last updated: 9/3/2026, 9:24:43 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Stack<Integer> st=new Stack<>();
4        int max=0;
5        for(int i=0;i<=heights.length;i++){
6            int current;
7            if(i==heights.length) current=0;
8            else current=heights[i];
9            while(!st.isEmpty() && current<heights[st.peek()]){
10                int h=heights[st.pop()];
11                int width;
12                if(st.isEmpty()) width=i;
13                else width=i-st.peek()-1;
14                max=Math.max(max,h*width);
15            }
16            st.push(i);
17        }
18        return max;
19    }
20}