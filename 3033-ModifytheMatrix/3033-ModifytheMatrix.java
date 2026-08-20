// Last updated: 8/20/2026, 2:56:33 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x=0,y=0;
4        for(char c:moves.toCharArray()){
5            if(c=='U') x++;
6            else if(c=='D') x--;
7            else if(c=='L') y++;
8            else y--;
9        }
10        return x==0 && y==0;
11    }
12}