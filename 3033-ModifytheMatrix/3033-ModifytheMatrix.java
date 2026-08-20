// Last updated: 8/20/2026, 3:14:12 PM
1class Solution {
2    public void merge(int[] a, int m, int[] b, int n) {
3        int i=m-1,j=n-1,k=m+n-1;
4        while(i>=0 && j>=0){
5            if(a[i]>b[j]){
6                a[k]=a[i];
7                i--;
8            }else{
9                a[k]=b[j];
10                j--;
11            }
12            k--;
13        }
14        while(j>=0){
15            a[k]=b[j];
16            j--;
17            k--;
18        }
19
20    }
21}
22