// Last updated: 7/9/2026, 10:16:10 AM
class Solution {
    public boolean isPalindrome(int x) {
        boolean a=false;
        int temp=x;
        int rem=0,rev=0;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        return rev==temp;
    }
}