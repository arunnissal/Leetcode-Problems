// Last updated: 7/9/2026, 10:15:41 AM
class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a,b) ->a[0]-b[0]);
        int n=arr.length;
        int temp[]  =new int[2];
        temp[0]=arr[0][0];
        temp[1]=arr[0][1];
        ArrayList<int[]> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(temp[1]>=arr[i][0]){
                temp[1]=Math.max(temp[1],arr[i][1]);
            }else{
                ar.add(temp);
                temp=arr[i];
            }
        }
        ar.add(temp);
        int[][] arr1=new int[ar.size()][2];
        for(int i=0;i<ar.size();i++){
            arr1[i][0]=ar.get(i)[0];
            arr1[i][1]=ar.get(i)[1];
        }
        return arr1;
    }
}