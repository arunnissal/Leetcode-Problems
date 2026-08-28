// Last updated: 8/28/2026, 2:10:27 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        Stack<Integer> st=new Stack<>();
4        int n=temperatures.length;
5        int[] arr=new int[n];
6        for(int i=0;i<n;i++){
7            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
8                int index=st.pop();
9                arr[index]=i-index;
10            }
11            st.push(i);
12        }
13        return arr;
14    }
15}