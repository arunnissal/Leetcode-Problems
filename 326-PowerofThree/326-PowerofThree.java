// Last updated: 9/2/2026, 9:27:52 AM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        int n = tokens.length;
4        int[] st = new int[n];
5        int top=-1;
6        for(String t:tokens){
7            if(t.equals("+")) {
8                st[top-1]=st[top-1]+st[top--];
9            }else if(t.equals("-")) {
10                st[top-1]=st[top-1]-st[top--];
11            }else if(t.equals("*")) {
12                st[top-1]=st[top-1]*st[top--];
13            }else if(t.equals("/")) {
14                st[top-1]=st[top-1]/st[top--];
15            }else {
16                st[++top]=Integer.parseInt(t);
17            }
18        }
19        return st[0];
20    }
21}