// Last updated: 7/9/2026, 10:13:43 AM
class Solution {
    public int[] sortedSquares(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        int l=0;
        int r=n-1;
        int pos=n-1; 
        while(l<=r) {
            int lsq=arr[l]*arr[l];
            int rsq=arr[r]*arr[r];
            if(lsq>rsq){
                res[pos]=lsq;
                l++;
            }else{
                res[pos]=rsq;
                r--;
            }pos--;
        }
        return res;
    }
}