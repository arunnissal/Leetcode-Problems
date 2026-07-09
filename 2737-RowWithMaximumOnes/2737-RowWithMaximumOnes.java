// Last updated: 7/9/2026, 10:13:08 AM
class Solution {
    public int[] rowAndMaximumOnes(int[][] arr) {
        int c=0,m=0,r=0;
		for(int i=0;i<arr.length;i++){
		    c=0;
		    for(int j=0;j<arr[0].length;j++){
		        if(arr[i][j]==1){
		            c++;
		        }
		    }
		    if(m<c){
		        m=c;
		        r=i;
		    }
		}
        int[] res={r,m};
		return res;
    }
}