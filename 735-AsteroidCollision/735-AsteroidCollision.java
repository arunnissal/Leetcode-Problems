// Last updated: 9/1/2026, 2:25:12 PM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> st = new Stack<>();
4        for(int i:asteroids){
5            boolean alive=true;
6            while(alive && !st.isEmpty() && st.peek()>0 && i<0){
7                if(st.peek()<-i){
8                    st.pop();
9                }else if(st.peek()==-i){
10                    st.pop();
11                    alive=false;
12                }else{
13                    alive=false;
14                }
15
16            }
17            if(alive){
18                st.push(i);
19            }
20        }
21        int[] arr=new int[st.size()];
22        int a=0;
23        for(int i:st){
24            arr[a]=i;
25            a++;
26        }
27        return arr;
28    }
29}