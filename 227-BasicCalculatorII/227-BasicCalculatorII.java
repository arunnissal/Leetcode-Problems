// Last updated: 9/2/2026, 10:10:20 AM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st=new Stack<>();
4        int num=0;
5        char sign='+';
6        for(int i=0;i<s.length();i++){
7            char c=s.charAt(i);
8            if(Character.isDigit(c)){
9                num=num*10+(c-'0');
10            }
11            if((!Character.isDigit(c) && c!=' ' )||i==s.length()-1){
12                if(sign=='+'){
13                    st.push(num);
14                }else if(sign=='-'){
15                    st.push(-num);
16                }else if(sign=='*'){
17                    st.push(st.pop()*num);
18                }else{
19                    st.push(st.pop()/num);
20                }
21                sign=c;
22                num=0;
23            }
24        }   
25        int ans=0;
26        while(!st.isEmpty()){
27            ans+=st.pop();
28        }
29        return ans;
30    }
31}