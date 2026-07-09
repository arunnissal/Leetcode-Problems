// Last updated: 7/9/2026, 10:15:20 AM
class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> subset=new ArrayList<>();
        int n=1<<arr.length;
        for(int i=0;i<=n-1;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                int num=i;
                if((num&(1<<j))!=0){
                    temp.add(arr[j]);
                }
            }
            subset.add(temp);
        }
        return subset;
    }
}