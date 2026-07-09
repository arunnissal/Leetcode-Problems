// Last updated: 7/9/2026, 10:14:11 AM
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        boolean hasOdd = false;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                ans += entry.getValue();
            } else {
                ans += entry.getValue() - 1;
                hasOdd = true;
            }
        }
        if (hasOdd) {
            return ans + 1;
        }
        return ans;
    }
}