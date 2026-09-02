// Last updated: 9/2/2026, 11:05:35 AM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st=new Stack<>();
4        int res=0,num=0,sign=1;
5        for(int i=0;i<s.length();i++){
6            char c=s.charAt(i);
7            if(Character.isDigit(c)){
8                num=num*10+(c-'0');
9            }
10            else if(c=='+'){
11                res+=sign*num;
12                num=0;sign=1;
13            }else if(c=='-'){
14                res+=sign*num;
15                num=0;sign=-1;
16            }else if(c=='('){
17                st.push(res);
18                st.push(sign);
19                res=0;
20                sign=1;
21            }else if(c==')'){
22                res+=sign*num;
23                num=0;
24                int oldS=st.pop();
25                int oldR=st.pop();
26
27                res=oldR+oldS*res;
28                
29            }
30            
31        }
32        res+=sign*num;
33        return res;
34    }
35}