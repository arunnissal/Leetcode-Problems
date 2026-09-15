// Last updated: 9/15/2026, 5:49:19 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i=0,j=numbers.length-1;
4        while(i<j){
5            if(numbers[i]+numbers[j]==target){
6                return new int[]{i+1,j+1};
7            }else if(numbers[i]+numbers[j]<target){
8                i++;
9            }else{
10                j--;
11            }
12        }
13        return new int[]{-1,-1};
14    }
15}