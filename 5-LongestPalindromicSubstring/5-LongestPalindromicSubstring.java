// Last updated: 8/10/2026, 2:09:58 PM
1class Solution {
2   int start,end;
3    public String longestPalindrome(String s) {
4        expand(s.toCharArray(),0);
5        return s.substring(start,end+1);
6    }
7    private void expand(char[] s , int i){
8        int n=s.length;
9        if(i>=n)return;
10        int right=i;
11        int left=i;
12        while(right+1<n && s[i]==s[right+1]){
13            right++;
14        }
15        i=right+1;
16        while(right+1<n && left-1>=0 && s[right+1]==s[left-1]){
17            right++;
18            left--;
19        }
20        if(end-start<right-left){
21            start=left;
22            end=right;
23        }
24        expand(s,i);
25    }
26}