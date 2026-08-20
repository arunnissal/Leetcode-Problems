// Last updated: 8/20/2026, 6:00:05 PM
1import java.util.Set;
2
3class Solution {
4    public int[] intersection(int[] nums1, int[] nums2) {
5        Set<Integer> set1 = new HashSet<>();
6        for (int i : nums1) {
7            set1.add(i);
8        }
9        Set<Integer> ans=new HashSet<>();
10        for(int i:nums2){
11            if(set1.contains(i)){
12                ans.add(i);
13            }
14        }
15        int[] arr=new int[ans.size()];
16        int j=0;
17        for(Integer i:ans){
18            arr[j]=i.intValue();
19            j++;
20        }
21        return arr;
22    }
23}