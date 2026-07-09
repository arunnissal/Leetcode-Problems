// Last updated: 7/9/2026, 10:13:44 AM
class Solution {
    public int search(int[] a, int target) {
        int i=0,j=a.length-1,mid=0;
        while(i<=j){
            mid=(j+i)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                i=mid+1;
            }else if(a[mid]>target){
                j=mid-1;
            }
        }
	    return -1;
    }
}