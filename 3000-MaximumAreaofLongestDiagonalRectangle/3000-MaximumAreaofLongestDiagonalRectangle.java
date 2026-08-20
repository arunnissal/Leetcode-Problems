// Last updated: 8/20/2026, 2:36:13 PM
1class Solution {
2    public int areaOfMaxDiagonal(int[][] dimensions) {
3        int maxD=0,maxA=0;
4        for(int i=0;i<dimensions.length;i++){
5            int l=dimensions[i][0];
6            int w=dimensions[i][1];
7            int D=l*l + w*w;
8            int A=l*w;
9            if(D>maxD){
10                maxD=D;
11                maxA=A;
12            }else if(D==maxD){
13                maxA=Math.max(A,maxA);
14            }
15        }
16        return maxA;
17    }
18}