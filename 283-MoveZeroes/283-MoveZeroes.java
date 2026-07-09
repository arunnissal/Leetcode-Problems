// Last updated: 7/9/2026, 10:14:31 AM
class Solution {
    public void moveZeroes(int[] arr) {
       int n=arr.length;
        
        int i=0,j=1;
        while(i<n && j<n){
            if(arr[i]!=0){
                i++;
                j++;
                continue;
            }
            if(arr[j]==0){
                j++;
                continue;
            }
            arr[i]=arr[j];
            arr[j]=0;
        } 
    }
}